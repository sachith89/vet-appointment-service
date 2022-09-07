package com.vetstoria.appointments.model.request;


import com.vetstoria.appointments.model.PaymentProviderType;


import java.math.BigDecimal;

public interface PaymentRequest {
    // any common fields
    PaymentProviderType getPaymentProviderType();

}