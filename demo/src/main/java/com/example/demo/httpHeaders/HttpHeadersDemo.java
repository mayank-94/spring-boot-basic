/**
 * 
 */
package com.example.demo.httpHeaders;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
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
@RequestMapping(path = "/api")
public class HttpHeadersDemo {
	
	@GetMapping(path = "/servlet-response-header")
	public String usingHttpServletResponse(HttpServletResponse response) {
		response.addHeader("Header-Name", "HttpServletResponse Header");
		return "Response using HttpServletResponse";
	}
	
	@GetMapping(path = "/response-entity-header")
	public ResponseEntity<String> usingResponseEntity(){
		HttpHeaders headers = new HttpHeaders();
		headers.add("Header-Name", "ResponseEntity Header");
		return new ResponseEntity<String>("ResponseEntity Header", headers, HttpStatus.OK);
	}
	
	
}
