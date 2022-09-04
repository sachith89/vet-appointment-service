package com.vetstoria.appointments.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vetstoria.appointments.model.request.AppointmentRequest;
import com.vetstoria.appointments.model.request.ClientRequest;
import com.vetstoria.appointments.model.request.PetRequest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class AppointmentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/api/v1/user"))
               // .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello")));
    }

    @Test
    @DisplayName("Should Return Error Message When Email Is Incorrect")
    public void shouldReturnErrorMessageWhenEmailIsIncorrect() throws Exception {
        PetRequest petDTO = PetRequest.builder()
                .petName("Rocky")
                .breed("Great Dane")
                .age(2)
                .build();

        ClientRequest clientDTO = ClientRequest.builder()
                .firstName("Sachith")
                .lastName("Lakmal")
                .email("sachith#gmail.com")
                .contactNo("0771176372")
                .build();

        AppointmentRequest appointmentDTO = AppointmentRequest.builder()
                .client(clientDTO)
                .pet(petDTO)
                .build();


        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(appointmentDTO);

        this.mockMvc.perform(
                        post("/api/v1/appointments/")
                                .contentType(new MediaType(MediaType.APPLICATION_JSON))
                                .content(requestJson))
              //  .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.errors", hasSize(1)))
                .andExpect(jsonPath("$.errors[*]", is(Matchers.containsInAnyOrder(Matchers.is("Invalid Email")))));
    }
}