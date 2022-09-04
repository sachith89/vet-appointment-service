package com.vetstoria.appointments.model.request;

import com.vetstoria.appointments.model.PaymentProviderType;

public class ProviderThreePaymentRequest extends PaymentRequest {

    @Override
    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_THREE;
    }

}