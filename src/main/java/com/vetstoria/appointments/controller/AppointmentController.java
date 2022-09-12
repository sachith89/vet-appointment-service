package com.vetstoria.appointments.controller;

import com.vetstoria.appointments.model.dto.AppointmentDto;
import com.vetstoria.appointments.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping("/")
    public ResponseEntity<AppointmentDto> saveAppointment(@RequestBody @Valid AppointmentDto appointmentDTO) {
        appointmentDTO.setAppointmentId(UUID.randomUUID().toString());
        return ResponseEntity.ok(appointmentService.save(appointmentDTO));
    }


    //TODO: update appointments
    //TODO: cancel appointments
    //TODO: get all appointments
    //TODO: get single appointments


}
