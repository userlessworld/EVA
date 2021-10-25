package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import whz.pti.eva.praktikum_02.grade.service.GradeServiceImpl;

@SpringBootApplication
public class GradleCalculatorKlinkertHorlbeckWolskiApplication {

	private GradeServiceImpl gr = new GradeServiceImpl();
	
	public static void main(String[] args) {
		SpringApplication.run(GradleCalculatorKlinkertHorlbeckWolskiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init() {
		gr.addGrade("a", "1.0");
		gr.addGrade("b", "2.0");
		return (evt) -> System.out.print(gr.calculateAverage());
		
	}

}
