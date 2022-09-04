package com.vetstoria.appointments.service.impl;


import com.vetstoria.appointments.model.request.ProviderTwoPaymentRequest;
import com.vetstoria.appointments.model.response.ProviderTwoPaymentResponse;
import com.vetstoria.appointments.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class ProviderTwoPaymentServiceImpl implements PaymentService<ProviderTwoPaymentRequest, ProviderTwoPaymentResponse> {

    @Override
    public ProviderTwoPaymentResponse pay(ProviderTwoPaymentRequest request) {
        // TODO payment logic with provider 2 ...
        return new ProviderTwoPaymentResponse();
    }

}