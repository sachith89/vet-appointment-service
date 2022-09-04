package com.vetstoria.appointments.model.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class ClientRequest {

    private Long clientId;

    @NotBlank(message = "Invalid firstName : Cannot be empty")
    @NotNull(message = "Invalid firstName : Cannot be NULL")
    private String firstName;

    @NotBlank(message = "Invalid lastName : Cannot be empty")
    @NotNull(message = "Invalid lastName : Cannot be NULL")
    private String lastName;

    @Email(message = "Invalid Email")
    private String email;

    @NotBlank(message = "Invalid Phone number: Empty number")
    @NotNull(message = "Invalid Phone number: Number is NULL")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    private String contactNo;
}
