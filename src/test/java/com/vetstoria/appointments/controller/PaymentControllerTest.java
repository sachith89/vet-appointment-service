package com.vetstoria.appointments.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vetstoria.appointments.model.request.AppointmentRequest;
import com.vetstoria.appointments.model.request.ClientRequest;
import com.vetstoria.appointments.model.request.PetRequest;
import com.vetstoria.appointments.model.request.ProviderOnePaymentRequest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PaymentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("Should Return Error Message When Email Is Incorrect")
    public void shouldReturnErrorMessageWhenEmailIsIncorrect() throws Exception {

        ProviderOnePaymentRequest providerOnePaymentRequest = new ProviderOnePaymentRequest(
                "001", new BigDecimal(100), "description");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(providerOnePaymentRequest);

        this.mockMvc.perform(
                        post("/api/v1/payment/pay")
                                .contentType(new MediaType(MediaType.APPLICATION_JSON))
                                .content(requestJson))
                //  .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.errors", hasSize(1)))
                .andExpect(jsonPath("$.errors[*]", is(Matchers.containsInAnyOrder(Matchers.is("Invalid Email")))));
    }
}