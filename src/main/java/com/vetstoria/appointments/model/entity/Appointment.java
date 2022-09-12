package com.vetstoria.appointments.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "tbl_vetstoria_appointments")
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @Column(name = "appointmentId", nullable = false)
    private String appointmentId;

    private String locationId;
    private LocalDateTime dateTime;
    private String bookingSource;

}
