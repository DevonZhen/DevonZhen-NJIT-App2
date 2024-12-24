package njit.cs.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import njit.cs.demo.domain.Person;
import njit.cs.demo.domain.PersonType;
import njit.cs.demo.repository.PersonRepository;
import njit.cs.demo.repository.PersonTypeRepository;
import njit.cs.demo.service.PersonService;

/*
 * Combining Person and Person Types Service Implementations  into one repository (was 2 in old version)
 */
@Service
public class PersonServiceImpl  implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PersonTypeRepository PersonTypeRepository;
	
	@Override
	public List<Person> findAll(){
		return personRepository.findAll();
	}

	@Override
	public Person findByUidAndPassword(String uid, String pwd) {
		return personRepository.findByUidAndPassword(uid, pwd);
	}
	
	@Override
	public Person getPersonBySSN(Long ssn) {
		return  personRepository.getPersonBySSN(ssn);
	}
	
	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	public void deletePerson(Long id) {
		personRepository.deleteByPersonId(id);
	}

	@Override
	public List<PersonType> getPersonTypes() {
		return PersonTypeRepository.findAll();
	}

	
	@Override
	public PersonType getPersonTypeByType(String type) {
		return PersonTypeRepository.findByPersonType(type);
	}


}
