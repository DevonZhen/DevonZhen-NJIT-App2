package njit.cs.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import njit.cs.demo.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	public List<Person> findAll();
	public void deleteById(Long id);
	
	// [findBy]+<Uid>+<Password> (From the Person Domain)
	public Person findByUidAndPassword(String uid, String pwd);
//	public Person save(Person person);
	
	@Query("Select  p FROM Person p WHERE ssn = ?1")
	public Person getPersonBySSN(Long ssn);


}
