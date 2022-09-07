package com.vetstoria.appointments.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RefundRequest {

    private String refundId;
    private String appointmentId;
    private String amount;
    private String description;


}
