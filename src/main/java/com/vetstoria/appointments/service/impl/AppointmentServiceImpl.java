package com.vetstoria.appointments.service.impl;

import com.vetstoria.appointments.model.entity.Appointment;
import com.vetstoria.appointments.model.dto.AppointmentDto;
import com.vetstoria.appointments.repository.AppointmentRepository;
import com.vetstoria.appointments.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    @Transactional
    public AppointmentDto save(AppointmentDto appointmentDto) {

        Appointment appointment = new Appointment();
        BeanUtils.copyProperties(appointmentDto, appointment);
        appointmentRepository.save(appointment);
        return appointmentDto;
    }
}
