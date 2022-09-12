package com.vetstoria.appointments.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
public class RefundDto {

    @NotNull
    private String refundId;

    @NotNull
    private String appointmentId;
        
    private double amount;
    private String description;


}
