package com.his.patientdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.his.restControllers"} )
public class PatientdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientdataApplication.class, args);
	}

}
