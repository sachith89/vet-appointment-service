package com.vetstoria.appointments.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_vetstoria_payments")
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @Column(name = "paymentId", nullable = false)
    private String paymentId;

    private String appointmentId;
    private double amount;
    private String bookingSource;

}
