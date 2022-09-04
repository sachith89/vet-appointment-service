package com.vetstoria.appointments.paymentgateway.provider;


import com.vetstoria.appointments.model.PaymentProviderType;

public interface PaymentProvider<T> {
    T getProvider(PaymentProviderType type);
}
