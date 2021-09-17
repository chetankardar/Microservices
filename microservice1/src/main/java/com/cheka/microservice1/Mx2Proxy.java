package com.cheka.microservice1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service2",url="localhost:8182")
public interface Mx2Proxy {

	@GetMapping("/getConversion/{input}")
	public Integer callMx2Conversion(@PathVariable Integer input);
}
