package com.vetstoria.appointments.service;

import com.vetstoria.appointments.model.dto.AppointmentDto;
import com.vetstoria.appointments.model.dto.PaymentDto;
import com.vetstoria.appointments.model.dto.RefundDto;

public interface PaymentService {

    PaymentDto pay(PaymentDto paymentRequest);

    RefundDto refund(AppointmentDto appointmentDto);
}
