package com.vetstoria.appointments.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class RefundDto {

    @NotNull
    private String refundId;

    @NotNull
    private String appointmentId;
        
    private String amount;
    private String description;


}
