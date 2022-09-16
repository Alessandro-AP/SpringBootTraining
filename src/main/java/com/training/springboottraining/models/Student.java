package com.training.springboottraining.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class Student {

    @JsonProperty("studentId")
    private final UUID studentId;
    @JsonProperty("fistName")
    private final String firstName;
    @JsonProperty("lastName")
    private final String lastName;
    @JsonProperty("email")
    private final String email;
    @JsonProperty("gender")
    private final Gender gender;

    public enum Gender { MALE, FEMALE}

}
