package com.example.demo;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetEmpController {
//RepositoryDependancy
	@Autowired
	GetEmployeeRepository empregrep;
	
	//write the post method
	@RequestMapping(value="/employee/{i}",method=RequestMethod.GET)
	public ResponseEntity<Object> empRegistration(@Valid@PathVariable long i)
	{
		empregrep.findById(i);
		return new ResponseEntity<>("Employee retrived successsfully", HttpStatus.OK);
	}
	
}
