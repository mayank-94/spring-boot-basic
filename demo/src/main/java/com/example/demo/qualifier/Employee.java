package com.example.demo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */
@Component
@Qualifier("employee")
public class Employee implements Person{

	@Override
	public String display() {
		return "Employee";
	}
	
}
