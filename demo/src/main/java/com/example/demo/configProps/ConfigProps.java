/**
 * 
 */
package com.example.demo.configProps;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */

@Component
@ConfigurationProperties(prefix = "person-details")
public class ConfigProps {
	
	private int age;
	private String name;
	private String salary;
	
	public ConfigProps() {
		super();
	}
	
	public ConfigProps(int age, String name, String salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
