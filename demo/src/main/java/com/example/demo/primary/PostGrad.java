/**
 * 
 */
package com.example.demo.primary;

import org.springframework.stereotype.Component;

/**
 * @author Mayank
 *
 */

@Component
public class PostGrad implements Student {

	@Override
	public String info() {
		return "PostGrad";
	}

}
