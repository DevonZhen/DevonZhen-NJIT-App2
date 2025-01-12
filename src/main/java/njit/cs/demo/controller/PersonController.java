package njit.cs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import njit.cs.demo.domain.*;
import njit.cs.demo.service.PersonService;

@RestController
@CrossOrigin(origins = "*")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/findAll")
	public List<Person> findAll(){
		return personService.findAll();
	};

	
	@GetMapping("/personByUidandPwd/{uid}/{pwd}")
	public Person findByUserIdAndPassword(@PathVariable String uid, @PathVariable  String pwd) {
		try{
				System.out.println("Values: "+uid+" "+pwd);
			 return personService.findByUidAndPassword(uid, pwd);
		}catch(Exception e) {
			System.out.println(" Error finding person by User ID and Password... ");
			return null;
		}
	};

	 //  ?ssn is query path parameter
	@GetMapping("/personBySsn/{ssn}") 
	public ResponseEntity<Person> getPersonBySsn(@PathVariable Long ssn) {
		try {
			return new ResponseEntity<Person>(personService.getPersonBySSN(ssn),  HttpStatus.OK);
		}catch(Exception e){
			System.out.println(" Error getting person by SSN... ");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	};
	
	// @PutMapping would be require if separating create/new person
	// PostMapping works with Hibernate 'save' method
	@PostMapping("/postPerson")
	public Person postPerson(@RequestBody Person person) {
		try{
			System.out.println("Person: "+person.getPersonTypeId());
			personService.save(person);
		}catch(Exception e) {
			System.out.println("Error posting Person...");

		}
		return person;
	};
	
	
	@DeleteMapping("/deletePerson/{id}")
	public void deletePerson(@PathVariable Long id) {
		try{
			personService.deleteById(id);
		}catch(Exception e) {
			System.out.println("Error deleting person... ");
			
		}
	};
	
	
	@GetMapping("/personTypes")
	public ResponseEntity<List<PersonType>> getPersonTypes() {
		try{
			return new ResponseEntity<>(personService.getPersonTypes(),HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(" Error getting person types... ");
			return new ResponseEntity<List<PersonType>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	};
	
	@GetMapping("/personTypeByType/{type}")
	public ResponseEntity<PersonType> getPersonTypeByType(@PathVariable String type) {
		try{
			PersonType result = personService.getPersonTypeByType(type);
			
//			if(result == null)
//				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
			return new ResponseEntity<PersonType>(result, HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(" Error getting person type by type");
			return new ResponseEntity<PersonType>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	};
}
