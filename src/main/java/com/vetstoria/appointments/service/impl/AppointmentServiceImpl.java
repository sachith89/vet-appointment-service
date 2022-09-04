package com.vetstoria.appointments.service.impl;

import com.vetstoria.appointments.model.request.AppointmentRequest;
import com.vetstoria.appointments.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final Clock clock = Clock.systemDefaultZone();

    @Override
    @Transactional
    public AppointmentRequest save(AppointmentRequest appointmentRequest) {

        appointmentRequest.setDateTime(LocalDateTime.now(clock));
        System.out.println(appointmentRequest);
        return null;
    }
}
