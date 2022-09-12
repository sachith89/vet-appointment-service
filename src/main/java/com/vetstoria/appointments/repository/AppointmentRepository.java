package com.vetstoria.appointments.repository;

import com.vetstoria.appointments.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {

    Optional<Appointment> findByAppointmentId(String appointmentId);
}
