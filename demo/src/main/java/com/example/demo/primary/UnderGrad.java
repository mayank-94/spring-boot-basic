package com.example.demo.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */
@Component
@Primary
public class UnderGrad implements Student {

	@Override
	public String info() {
		return "UnderGrad";
	}

}
