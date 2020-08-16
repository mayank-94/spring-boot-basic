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
public class Boat extends Vehicle {
	
	private String anchor;

	public Boat() {
		super();
	}

	public String getAnchor() {
		return anchor;
	}

	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}
		
}
