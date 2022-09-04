package com.vetstoria.appointments.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class AppointmentDTO {

    private Long locationId;
    private LocalDateTime dateTime;
    private String bookingSource;
    private ClientDTO client;
    private List<PaymentDTO> payment;
    private PetDTO pet;

}
