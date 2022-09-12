package com.vetstoria.appointments.controller;

import com.vetstoria.appointments.model.dto.AppointmentDto;
import com.vetstoria.appointments.model.dto.PaymentDto;
import com.vetstoria.appointments.model.dto.RefundDto;
import com.vetstoria.appointments.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<PaymentDto> pay(PaymentDto paymentDto) {
        paymentDto.setPaymentId(UUID.randomUUID().toString());
        return ResponseEntity.ok(paymentService.pay(paymentDto));
    }

    @PostMapping("refund")
    public ResponseEntity<RefundDto> pay(AppointmentDto appointmentDto) {
        if(!StringUtils.hasText(appointmentDto.getAppointmentId())){
            //throw exception and notify user that appointment id cannot be empty
        }
        return ResponseEntity.ok(paymentService.refund(appointmentDto));
    }


}
