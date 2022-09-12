package com.vetstoria.appointments.service.impl;

import com.vetstoria.appointments.model.dto.AppointmentDto;
import com.vetstoria.appointments.model.dto.PaymentDto;
import com.vetstoria.appointments.model.dto.RefundDto;
import com.vetstoria.appointments.model.entity.Payment;
import com.vetstoria.appointments.repository.AppointmentRepository;
import com.vetstoria.appointments.repository.PaymentRepository;
import com.vetstoria.appointments.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final AppointmentRepository appointmentRepository;
    private final Clock clock = Clock.systemDefaultZone();

    @Override
    public PaymentDto pay(PaymentDto paymentDto) {

        Payment payment = new Payment();
        BeanUtils.copyProperties(paymentDto, payment);
        paymentRepository.save(payment);

        return paymentDto;
    }

    @Override
    public RefundDto refund(AppointmentDto appointmentDto) {
        appointmentRepository.findByAppointmentId(appointmentDto.getAppointmentId())
                .ifPresent(appointment -> {
                            paymentRepository.findByAppointmentId(appointment.getAppointmentId())
                                    .ifPresent(payment -> {
                                        RefundDto refundDto = new RefundDto();
                                        if (ChronoUnit.DAYS.between(appointment.getDateTime(), LocalDate.now(clock)) >= 3) {
                                            refundDto.setAmount(payment.getAmount());
                                        } else {
                                            refundDto.setAmount((payment.getAmount() / 100) * 80);
                                        }
                                        doRefund(refundDto);
                                    });
                        }
                );
        return null;
    }

    private void doRefund(@NotNull RefundDto refundDto) {
        // refund implementation
        System.out.println("Refunding amount of $ " + refundDto.getAmount());
    }


}
