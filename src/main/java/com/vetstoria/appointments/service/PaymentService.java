package com.vetstoria.appointments.service;


import com.vetstoria.appointments.model.request.PaymentRequest;
import com.vetstoria.appointments.model.response.PaymentResponse;

public interface PaymentService<T extends PaymentRequest, R extends PaymentResponse> {
    R pay(T request);
}
