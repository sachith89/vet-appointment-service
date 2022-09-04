package com.vetstoria.appointments.paymentgateway.gateway;

import com.vetstoria.appointments.model.request.PaymentRequest;
import com.vetstoria.appointments.model.response.PaymentResponse;

public interface PaymentGateway<T extends PaymentResponse, K extends PaymentRequest> {
    T makePayment(K paymentRequest);
}