package njit.cs.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import njit.cs.demo.domain.PersonType;

@Repository
public interface PersonTypeRepository extends JpaRepository<PersonType, Long>{
	
	public List<PersonType> findAll();
	
	//Note [findBy]+<Variable Based on the Domain> [PersonType]
	public PersonType findByPersonType(String type);
	
	//Object Based SQL
	//Note [using the column object name instead of column name]
//	@Query("Select t FROM PersonType t WHERE t.personTypeId = ?1")
//	public PersonType findByPersonType(String type);

	//True SQL
//	@Query(nativeQuery=true, value="Select t.type, t.pert_id FROM Person_Type t WHERE type = ?1")
//	public PersonType findByPersonType(String type);
}
