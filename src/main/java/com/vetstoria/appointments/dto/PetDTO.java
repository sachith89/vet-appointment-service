package com.vetstoria.appointments.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class PetDTO {

    private Long petId;
    private String petName;
    private String petType;
    private String breed;
}
