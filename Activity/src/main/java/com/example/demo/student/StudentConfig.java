package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student norberto = new Student(
                    "Norberto",
                    "Norberto@gmail.com",
                    LocalDate.of(2000, MARCH, 31)
            );

            Student cait = new Student(
                    "Cait",
                    "Cait@gmail.com",
                    LocalDate.of(1999, MARCH, 11)
            );

            repository.saveAll(
                    List.of(norberto, cait)
            );
        };
    }
}

