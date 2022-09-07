package com.vetstoria.appointments.model.request;


import com.vetstoria.appointments.model.PaymentProviderType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProviderOnePaymentRequest implements PaymentRequest {

    private String paymentId;
    private BigDecimal amount;
    public String description;

    @Override
    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_ONE;
    }

}