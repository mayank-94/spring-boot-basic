package com.example.demo.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */
@Component
@Order(1)
public class Car implements Vehicle {

	@Override
	public String info() {
		return "Car";
	}

}
