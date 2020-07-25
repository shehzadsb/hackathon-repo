package com.rapid.workload.workloadcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rapid.workload.jpa.SubOrderRepository;


@RestController
@RequestMapping(path="/api")
public class WorkloadRestController {
	
	private SubOrderRepository subOrderRepository;
	
	@Autowired
	org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	@GetMapping(path="/suborders")
	  public @ResponseBody Iterable<Integer> getTodaysSubOrdersByGroupName(@RequestParam Integer groupId) {
		//subOrderRepository
		
	    return subOrderRepository.findAll();
	}
	
	@RequestMapping(value = "/processSubOrder", method = RequestMethod.POST,
			consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
					 produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	  public ResponseEntity<?> processSubOrder(@RequestBody Integer subOrderId) throws Exception {
		
		//subOrderRepository.save(arg0);
		
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@RequestMapping(value = "/consolidateOrder", method = RequestMethod.POST,
			consumes={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
					 produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	  public ResponseEntity<?> consolidateOrder(@RequestBody Integer orderId) throws Exception {
		
		//subOrderRepository.save(arg0);
		
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
}
