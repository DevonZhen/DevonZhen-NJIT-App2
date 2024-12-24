package njit.cs.demo.service;

import java.util.List;

import njit.cs.demo.domain.Person;
import njit.cs.demo.domain.PersonType;

/*
 * Combining Person and Person Types Service  into one repository (was 2 in old version)
 */
public interface PersonService {
	
		//Person
		List<Person> findAll();
		Person save(Person person);
		
		Person findByUidAndPassword(String uid, String pwd);
		Person getPersonBySSN(Long ssn);
		void deletePerson(Long id);
		
		
		//Person Types
		List<PersonType> getPersonTypes();
		
		PersonType getPersonTypeByType(String type);
}
