package com.vetstoria.appointments.service;

import com.vetstoria.appointments.model.dto.AppointmentDto;

public interface AppointmentService {

    AppointmentDto save(AppointmentDto appointmentDTO);
}
