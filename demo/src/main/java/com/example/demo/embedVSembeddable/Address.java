/**
 * 
 */
package com.example.demo.embedVSembeddable;

import javax.persistence.Embeddable;

/**
 * @author Mayank
 *
 */
@Embeddable
public class Address {
	
	private String city;
	private String State;
	
	public Address() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}	
}
