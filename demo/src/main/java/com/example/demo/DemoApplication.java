package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.order.Vehicle;
import com.example.demo.primary.Student;
import com.example.demo.qualifier.Person;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("employee")
	private Person person;
	
	@Autowired
	private List<Vehicle> vehicles;
	
	@Autowired
	private Student student;
		
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Qualifier example - "+person.display());
		vehicles.forEach(x -> System.out.print(x.info()+" "));
		System.out.println();
		System.out.println("Primary Bean is - "+student.info());
	}

}
