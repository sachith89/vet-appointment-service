package com.vetstoria.appointments.controller;

import com.vetstoria.appointments.dto.AppointmentDTO;
import com.vetstoria.appointments.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.Clock;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping("/")
    public ResponseEntity<AppointmentDTO> saveAppointment(@RequestBody @Valid AppointmentDTO appointmentDTO) {
        return new ResponseEntity(appointmentService.save(appointmentDTO), HttpStatus.CREATED);
    }


    //TODO: update appointments
    //TODO: cancel appointments
    //TODO: get all appointments
    //TODO: get single appointments

}
