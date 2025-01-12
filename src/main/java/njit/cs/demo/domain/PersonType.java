package njit.cs.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON_TYPE")
public class PersonType {
	
	@Id
	@SequenceGenerator(name="id_Sequence", sequenceName="seq_pertype", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@Column(name = "PERT_ID")
	private Integer personTypeId;
	
	@Column(name = "TYPE")
	private String personType;

//	===========================================================================
	
	public Integer getPersonTypeId() {
		return personTypeId;
	}

	public void setPersonTypeId(Integer personTypeId) {
		this.personTypeId = personTypeId;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

}
