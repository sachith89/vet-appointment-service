package com.vetstoria.appointments.producer;


import com.vetstoria.appointments.constants.Topics;
import com.vetstoria.appointments.model.dto.AppointmentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentProducerService {

    private static final String TOPIC_NAME = Topics.APPOINTMENT_EVENTS;
    private final KafkaTemplate<String, AppointmentDto> kafkaTemplate;

    public void send(AppointmentDto appointmentDTO) {
        kafkaTemplate.send(TOPIC_NAME,"appointment-event", appointmentDTO);
    }
}