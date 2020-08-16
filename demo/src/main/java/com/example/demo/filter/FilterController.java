/**
 * 
 */
package com.example.demo.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mayank
 *
 */

@RestController
@RequestMapping("/api")
public class FilterController {
	
	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello-World";
	}
	
}
