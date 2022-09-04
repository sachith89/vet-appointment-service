package com.vetstoria.appointments.model.request;


import com.vetstoria.appointments.model.PaymentProviderType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public abstract class PaymentRequest {
    // any common fields

    @NotBlank(message = "Invalid PaymentProviderType : Cannot be empty")
    @NotNull(message = "Invalid PaymentProviderType : Cannot be NULL")
    public abstract PaymentProviderType getPaymentProviderType();
}