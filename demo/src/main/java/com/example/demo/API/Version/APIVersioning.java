/**
 * 
 */
package com.example.demo.API.Version;

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
public class APIVersioning {
	
	
	//Versions using URI
	@GetMapping(value = "/v1/employee")
	public ResponseEntity<Employee> getEmployeeURIV1(){
		Employee e1 = new Employee();
		e1.setName("Charlie");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v2/employee")
	public ResponseEntity<Employee> getEmployeeURIV2(){
		Employee e1 = new Employee();
		e1.setName("Sierra");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	
	
	//Versions using Request Parameter
	//http://localhost:8080/api/employee?verson1
	@GetMapping(value = "/employee", params = "version1")
	public ResponseEntity<Employee> getEmployeeParamsV1(){
		Employee e1 = new Employee();
		e1.setName("Alex");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	//http://localhost:8080/api/employee?verson2
	@GetMapping(value = "/employee", params = "version2")
	public ResponseEntity<Employee> getEmployeeParamsV2(){
		Employee e1 = new Employee();
		e1.setName("Jene");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	
	//Versions using Header
	@GetMapping(value = "/employee", headers = "X-API-VERSION=1")
	public ResponseEntity<Employee> getEmployeeHeaderV1(){
		Employee e1 = new Employee();
		e1.setName("Max");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	@GetMapping(value = "/employee", headers = "X-API-VERSION=2")
	public ResponseEntity<Employee> getEmployeeHeaderV2(){
		Employee e1 = new Employee();
		e1.setName("Diane");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK);
	}
	
	
	//Versions using MediaType
	@GetMapping(value = "/employee", produces = "application/abc.mycompany.app-v1+json")
	public ResponseEntity<Employee> getEmployeeMediaV1(){
		Employee e1 = new Employee();
		e1.setName("Paul");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK); 
	}
	
	@GetMapping(value = "/employee", produces = "application/abc.mycompany.app-v2+json")
	public ResponseEntity<Employee> getEmployeeMediaV2(){
		Employee e1 = new Employee();
		e1.setName("Walter");
		return new ResponseEntity<Employee>(e1, HttpStatus.OK); 
	}

}
