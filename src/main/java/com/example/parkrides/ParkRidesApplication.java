package com.example.parkrides;

import com.example.parkrides.entity.Ride;
import com.example.parkrides.repository.RideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParkRidesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkRidesApplication.class, args);
    }

    @Bean
    public CommandLineRunner sampleData(RideRepository repository) {
        return (args) -> {
            repository.save(new Ride("Roller-Coaster", "Train ride that speeds you along.", 5, 300));
            repository.save(new Ride("Log Flume", "Boat ride with plenty of splashes.", 3, 250));
            repository.save(new Ride("Tea-Cups", "Spinning ride in a giant tea-cup.", 2, 400));
        };
    }

}
