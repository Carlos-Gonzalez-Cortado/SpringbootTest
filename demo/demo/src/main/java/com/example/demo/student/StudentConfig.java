package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student paco = new Student(
                    "Paco",
                    "kikoxavipelopincho@gmail.eu",
                    LocalDate.of(1999, APRIL, 1)
            );

            Student Sergio = new Student(
                    "Sergio",
                    "Sergio@gmail.eu",
                    LocalDate.of(1999, AUGUST, 25)
            );

            repository.saveAll(
                    List.of(paco, Sergio)
            );
        };
    }
}
