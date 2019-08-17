package com.example.validationspringboot.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


//must include all these
@AllArgsConstructor
@Getter
@Setter
public class User {
    @NotBlank(message = "username cannot be empt    y")  //validation annotations
    private String name;
    @NotBlank(message = "password cannot be empty")  //validation annotations
    @Length(min=6, max=10, message = "password must be betwee 6-10 characters")
    private String password;
    @Min(value=50)
    @Max(value=100, message="must be less than 105")
    private Double grade;
}