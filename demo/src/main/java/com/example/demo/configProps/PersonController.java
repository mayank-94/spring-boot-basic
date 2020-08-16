/**
 * 
 */
package com.example.demo.configProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mayank
 *
 */

@RestController
@RequestMapping(value = "/api")
public class PersonController {
	
	@Autowired
	private ConfigProps props;
	
	@Value("${address}")
	private String address;
	
	@GetMapping(value = "/person-details")
	public ResponseEntity<ConfigProps> getPersonDetails(){
		return new ResponseEntity<ConfigProps>(props, HttpStatus.OK);
	}
	
	@GetMapping(value = "/address")
	public ResponseEntity<Object> getAddress(){
		return new ResponseEntity<Object>(address, HttpStatus.OK);
	}
}
