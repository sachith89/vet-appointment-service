package com.vetstoria.appointments.service.impl;


import com.vetstoria.appointments.model.request.ProviderOnePaymentRequest;
import com.vetstoria.appointments.model.response.ProviderOnePaymentResponse;
import com.vetstoria.appointments.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class ProviderOnePaymentServiceImpl implements PaymentService<ProviderOnePaymentRequest, ProviderOnePaymentResponse> {

    @Override
    public ProviderOnePaymentResponse pay(ProviderOnePaymentRequest request) {
        // To do payment logic with provider 1 ...
        return new ProviderOnePaymentResponse();
    }

}
