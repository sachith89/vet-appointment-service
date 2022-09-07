package com.vetstoria.appointments.paymentgateway.gateway.impl;


import com.vetstoria.appointments.model.request.PaymentRequest;
import com.vetstoria.appointments.model.response.PaymentResponse;
import com.vetstoria.appointments.paymentgateway.gateway.PaymentGateway;
import com.vetstoria.appointments.paymentgateway.provider.PaymentProvider;
import com.vetstoria.appointments.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultPaymentGatewayImpl implements PaymentGateway<PaymentResponse, PaymentRequest> {

    private final PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> paymentProvider;

    @Override
    public PaymentResponse makePayment(PaymentRequest paymentRequest) {
        return paymentProvider.getProvider(paymentRequest.getPaymentProviderType()).pay(paymentRequest);
    }

}