package com.vetstoria.appointments.repository;

import com.vetstoria.appointments.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
    Optional<Payment> findByAppointmentId(String appointmentId);
}
