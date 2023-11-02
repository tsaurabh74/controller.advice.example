package com.saurabh.controller.advice.example.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    private int userId;
    @NotNull(message = "Username should not be null")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
}
