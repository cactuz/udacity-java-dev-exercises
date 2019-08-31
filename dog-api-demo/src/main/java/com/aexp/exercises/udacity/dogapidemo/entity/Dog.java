package com.aexp.exercises.udacity.dogapidemo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity  //This marks a Java class as an entity, which means it will be persisted to the database. Typically, an entity maps to a database table and the table contains rows that represent that given entity.
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String breed;
    private String origin;
}
