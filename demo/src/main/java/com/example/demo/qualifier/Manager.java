package com.example.demo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */
@Component
@Qualifier("manager")
public class Manager implements Person{

	@Override
	public String display() {
		return "Manager";
	}

}
