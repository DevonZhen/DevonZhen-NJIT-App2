package njit.cs.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import njit.cs.demo.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
	public List<Person> findAll();

}
