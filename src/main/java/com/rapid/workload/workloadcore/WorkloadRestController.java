package com.rapid.workload.workloadcore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rapid.workload.model.Counter;

@RestController
public class WorkloadRestController {
	private static final String template = "Hello, %s!";
	
	@GetMapping("/order")
	public Counter greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Counter("Kris");
	}
}
