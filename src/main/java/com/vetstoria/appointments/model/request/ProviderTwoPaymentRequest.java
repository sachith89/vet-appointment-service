package com.vetstoria.appointments.model.request;


import com.vetstoria.appointments.model.PaymentProviderType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class ProviderTwoPaymentRequest implements PaymentRequest {

    private String paymentId;
    public String description;
    private BigDecimal amount;

    @Override
    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_TWO;
    }

}