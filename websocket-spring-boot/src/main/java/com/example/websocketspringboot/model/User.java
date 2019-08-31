package com.example.websocketspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This is our message class
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
}
