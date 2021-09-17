package com.cheka.microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mx2Controller {

	@GetMapping("/getConversion/{input}")
	public Integer getConversion(@PathVariable Integer input) {
		
		return input*100;
	}
}
