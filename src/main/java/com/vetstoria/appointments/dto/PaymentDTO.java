package com.vetstoria.appointments.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class PaymentDTO {

    private String paymentId;
    private String paymentType;
    private String amount;

}
