package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpRegController {
//RepositoryDependancy
	@Autowired
	GetAllEmployeeRepository empregrep;
	
	//write the post method
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List getAllEmployee()
	{
		return (List)empregrep.findAll();
	}
}
