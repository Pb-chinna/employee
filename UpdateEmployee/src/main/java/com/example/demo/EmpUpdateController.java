package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmpUpdateController {
//RepositoryDependancy
	@Autowired
	UpdateEmployeeRepository empregrep;
	
	  @PutMapping("/employee/{id}") 
	  public EmpRegistration update(@RequestBody EmpRegistration employee) { 
		  return  empregrep.save(employee);
				  
				  }
	 
//	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
//	   public ResponseEntity<Object> updateProduct(@PathVariable("id") long id, @RequestBody EmpRegistration employee) { 
//	      empregrep.deleteById(id);
//	      employee.setEmpid(id);
//	      empregrep.s(id, employee);
//	      return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//	   }   
	}
	

