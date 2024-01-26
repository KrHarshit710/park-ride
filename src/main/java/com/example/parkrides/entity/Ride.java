package com.example.parkrides.entity;

import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ride {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;
    @NonNull
    private String name;
    private String description;
    private int thrillFactor;
    private double price;

    public Ride(@NonNull String name, String description, int thrillFactor, double price) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.price = price;
    }
}