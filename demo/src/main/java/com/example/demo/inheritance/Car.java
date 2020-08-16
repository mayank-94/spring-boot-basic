/**
 * 
 */
package com.example.demo.inheritance;

import javax.persistence.Entity;

/**
 * @author Mayank
 *
 */
@Entity
public class Car extends Vehicle {
	
	private String engine;

	public Car() {
		super();
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
