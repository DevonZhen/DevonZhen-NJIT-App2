package njit.cs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import njit.cs.demo.domain.Person;
import njit.cs.demo.repository.PersonRepository;

@Service
public class PersonService {

		@Autowired
		private PersonRepository personRepository;
		
		public List<Person> findAll(){
			return personRepository.findAll();
		}
}
