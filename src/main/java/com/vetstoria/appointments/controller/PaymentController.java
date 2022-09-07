package com.vetstoria.appointments.controller;

import com.vetstoria.appointments.model.request.PaymentRequest;
import com.vetstoria.appointments.model.request.ProviderOnePaymentRequest;
import com.vetstoria.appointments.model.request.RefundRequest;
import com.vetstoria.appointments.model.request.RefundResponse;
import com.vetstoria.appointments.model.response.PaymentResponse;
import com.vetstoria.appointments.paymentgateway.gateway.PaymentGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentGateway<PaymentResponse, PaymentRequest> paymentGateway;

    @PostMapping("/pay")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderOnePaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }

//    @PostMapping("/refund")
//    public ResponseEntity<RefundResponse> processRefund(@RequestBody RefundRequest refundRequest) {
//        return ResponseEntity.ok(paymentGateway.refundPayment(refundRequest));
//    }

}
