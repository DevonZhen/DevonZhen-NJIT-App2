package njit.cs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import njit.cs.demo.domain.Person;
import njit.cs.demo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/findAll")
	public List<Person> findAll(){
		return personService.findAll();
	}

}
