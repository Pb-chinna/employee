package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class DeleteEmployeeController {
//RepositoryDependancy
	@Autowired
	DeleteEmployeeRepository empregrep;
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> delete(@PathVariable("id") long id) { 
	      empregrep.deleteById(id);
	      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	   }
}
