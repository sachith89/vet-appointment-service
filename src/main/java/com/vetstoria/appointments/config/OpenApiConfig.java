package com.vetstoria.appointments.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Vetstoria Appointment Service API")
                        .description("A demo project implemented with Spring Boot and Java 11.")
                        .contact(new Contact().name("Sachith Lakmal").url("https://github.com/sachith89")));
    }
}