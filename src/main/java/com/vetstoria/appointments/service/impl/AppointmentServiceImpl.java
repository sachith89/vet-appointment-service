package com.vetstoria.appointments.service.impl;

import com.vetstoria.appointments.dto.AppointmentDTO;
import com.vetstoria.appointments.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final Clock clock = Clock.systemDefaultZone();

    @Override
    public AppointmentDTO save(AppointmentDTO appointmentDTO) {

        appointmentDTO.setDateTime(LocalDateTime.now(clock));

        return null;
    }
}
