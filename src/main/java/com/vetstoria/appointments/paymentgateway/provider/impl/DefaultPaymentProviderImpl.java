package com.vetstoria.appointments.paymentgateway.provider.impl;


import com.vetstoria.appointments.model.PaymentProviderType;
import com.vetstoria.appointments.model.request.PaymentRequest;
import com.vetstoria.appointments.model.response.PaymentResponse;
import com.vetstoria.appointments.paymentgateway.provider.PaymentProvider;
import com.vetstoria.appointments.service.PaymentService;
import com.vetstoria.appointments.service.impl.ProviderOnePaymentServiceImpl;
import com.vetstoria.appointments.service.impl.ProviderThreePaymentServiceImpl;
import com.vetstoria.appointments.service.impl.ProviderTwoPaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultPaymentProviderImpl implements PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> {
    private final ApplicationContext applicationContext;

    @Override
    @SuppressWarnings("rawtypes")
    public PaymentService getProvider(PaymentProviderType type) {
        switch (type) {
            case PROVIDER_ONE:
                return applicationContext.getBean(ProviderOnePaymentServiceImpl.class);
            case PROVIDER_TWO:
                return applicationContext.getBean(ProviderTwoPaymentServiceImpl.class);
            case PROVIDER_THREE:
                return applicationContext.getBean(ProviderThreePaymentServiceImpl.class);
            default:
                throw new UnsupportedOperationException("Notification type: " + type + " not supported");
        }
    }

}
