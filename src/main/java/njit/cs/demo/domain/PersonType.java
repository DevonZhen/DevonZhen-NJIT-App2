package njit.cs.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON_TYPE")
public class PersonType {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERT_ID")
	private Integer personTypeId;
	
	@Column(name = "PERSON_TYPE")
	private String personType;

}
