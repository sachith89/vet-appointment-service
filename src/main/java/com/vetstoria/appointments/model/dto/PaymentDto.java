package com.vetstoria.appointments.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

    @NotNull
    private String paymentId;

    @NotNull
    private String appointmentId;

    @Min(value = 1)
    @Max(value = 2000)
    private double amount;
}
