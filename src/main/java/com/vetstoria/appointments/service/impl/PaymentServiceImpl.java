package com.vetstoria.appointments.service.impl;

import com.vetstoria.appointments.model.dto.PaymentDto;
import com.vetstoria.appointments.model.dto.RefundDto;
import com.vetstoria.appointments.model.entity.Payment;
import com.vetstoria.appointments.repository.AppointmentRepository;
import com.vetstoria.appointments.repository.PaymentRepository;
import com.vetstoria.appointments.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final AppointmentRepository appointmentRepository;

    @Override
    public PaymentDto pay(PaymentDto paymentDto) {

        Payment payment = new Payment();
        BeanUtils.copyProperties(paymentDto, payment);
        paymentRepository.save(payment);

        return paymentDto;
    }

    @Override
    public RefundDto refund(RefundDto refundDto) {
        appointmentRepository.findByAppointmentId(refundDto.getAppointmentId())
                .ifPresent(appointment -> appointment::getDateTime);

        return null;
    }
}
