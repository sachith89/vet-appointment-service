package com.vetstoria.appointments.model.request;


import com.vetstoria.appointments.model.PaymentProviderType;

public abstract class PaymentRequest {
    // any common fields
    public abstract PaymentProviderType getPaymentProviderType();
}