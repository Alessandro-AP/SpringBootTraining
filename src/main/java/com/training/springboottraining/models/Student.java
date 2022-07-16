package com.training.springboottraining.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    enum Gender { MALE, FEMALE}

}
