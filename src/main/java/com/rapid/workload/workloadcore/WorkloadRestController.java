package com.rapid.workload.workloadcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rapid.workload.jpa.SubOrderRepository;


@RestController
@RequestMapping(path="/api")
public class WorkloadRestController {
	private static final String template = "Hello, %s!";
	
private SubOrderRepository subOrderRepository;
	
	@Autowired
	org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	@GetMapping(path="/suborders")
	  public @ResponseBody Iterable<Integer> getTodaysSubOrdersByGroupName(@RequestParam Integer groupId) {
		//subOrderRepository
		
	    return subOrderRepository.findAll();
	}
}
