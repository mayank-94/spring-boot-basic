/**
 * 
 */
package com.example.demo.embedVSembeddable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Mayank
 *
 */

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(updatable = false)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Embedded
	private Address address;
	
	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
