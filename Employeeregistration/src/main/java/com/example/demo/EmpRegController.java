package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmpRegController {
//RepositoryDependancy
	@Autowired
	EmployeeRegRepository empregrep;
	
	/*
	 * //write the post method
	 * 
	 * @RequestMapping(value="/reg",method=RequestMethod.POST) public
	 * EmpRegistration empRegistration(@RequestBody EmpRegistration empreg) { return
	 * empregrep.save(empreg); }
	 */
	@PostMapping("/reg")
    public EmpRegistration regEmployee(@RequestBody EmpRegistration employee){
         
         return empregrep.save(employee);
    }
}
