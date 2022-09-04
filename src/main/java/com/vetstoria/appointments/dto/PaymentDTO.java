package com.vetstoria.appointments.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class PaymentDTO {

    private Long paymentId;
    private String paymentType;
    private BigDecimal amount;

}
