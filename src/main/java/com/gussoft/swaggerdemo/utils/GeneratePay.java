package com.gussoft.swaggerdemo.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class GeneratePay {

    public static void main(String[] args) {
        System.out.println("Welcome To The Jungle!");
        GeneratePay program = new GeneratePay();
        System.out.println(program.calculateAge("1989-04-27"));
        System.out.println(program.calculateAge(LocalDate.of(1990,4, 5)));
    }

    public int calculateAge(String birthDate) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.parse(birthDate, format);
        return Period.between(birthday,LocalDate.now()).getYears();
    }

    public int calculateAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
