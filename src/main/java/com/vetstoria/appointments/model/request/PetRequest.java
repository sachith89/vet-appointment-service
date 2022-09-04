package com.vetstoria.appointments.model.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class PetRequest {

    private Long petId;
    private String petName;
    private String petType;
    private String breed;
    private int age;
}
