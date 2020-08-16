/**
 * 
 */
package com.example.demo.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */
@Component
@Order(2)
public class Bike implements Vehicle {

	@Override
	public String info() {
		return "Bike";
	}
}
