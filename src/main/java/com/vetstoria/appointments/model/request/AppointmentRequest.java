package com.vetstoria.appointments.model.request;

import lombok.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class AppointmentRequest {

    private Long locationId;
    private LocalDateTime dateTime;
    private String bookingSource;

    @Valid
    private ClientRequest client;
    private PetRequest pet;

}
