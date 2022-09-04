package com.vetstoria.appointments.service.impl;

import com.vetstoria.appointments.model.request.ProviderThreePaymentRequest;
import com.vetstoria.appointments.model.response.ProviderThreePaymentResponse;
import com.vetstoria.appointments.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class ProviderThreePaymentServiceImpl implements PaymentService<ProviderThreePaymentRequest, ProviderThreePaymentResponse> {

    @Override
    public ProviderThreePaymentResponse pay(ProviderThreePaymentRequest request) {
        // TODO payment logic with provider 3 ...
        return new ProviderThreePaymentResponse();
    }

}