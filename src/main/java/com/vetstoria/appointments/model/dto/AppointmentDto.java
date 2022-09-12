package com.vetstoria.appointments.model.dto;

import lombok.*;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class AppointmentDto {

    private String appointmentId;

    @NotNull(message = "Location cannot be null")
    private String locationId;

    @FutureOrPresent(message = "Back date does not allow")
    private LocalDateTime dateTime;

    private String bookingSource;

}
