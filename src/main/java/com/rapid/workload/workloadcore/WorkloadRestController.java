package com.rapid.workload.workloadcore;

import java.util.ArrayList;
import java.util.List;

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
import com.rapid.workload.model.SubOrder;


@RestController
@RequestMapping(path="/api")
public class WorkloadRestController {
	
	@Autowired
	SubOrderRepository subOrderRepository;
	
	//@Autowired
	//org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	
	
    @GetMapping("/allSubOrders")
	private ResponseEntity<List<SubOrder>> getAllProducts() {
	    List<SubOrder> listProd = new ArrayList<SubOrder>();
	    listProd = subOrderRepository.findAll();
	    
	    System.out.println("listProd: " + listProd.size());
	    //return listProd;
	    return new ResponseEntity<List<SubOrder>>(listProd, HttpStatus.OK);
	}

	
	
	@RequestMapping(value = "/suborder", method = RequestMethod.GET,
			
					 produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	  public ResponseEntity<?> getSubOrder(@RequestBody Integer subOrderId) throws Exception {
		
		//subOrderRepository.save(arg0);
		
		return new ResponseEntity<>( HttpStatus.OK);
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
