package com.vetstoria.appointments.service;

import com.vetstoria.appointments.model.request.AppointmentRequest;

public interface AppointmentService {

    AppointmentRequest save(AppointmentRequest appointmentDTO);
}
