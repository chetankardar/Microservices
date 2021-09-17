package com.cheka.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mx1Controller {

	@Autowired
	Mx2Proxy proxy;
	
	@GetMapping("/getConversion/{input}")
	public Integer conversion(@PathVariable Integer input) {
		
		return proxy.callMx2Conversion(input);
	}
}
