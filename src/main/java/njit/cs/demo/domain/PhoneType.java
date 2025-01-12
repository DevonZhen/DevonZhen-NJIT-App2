package njit.cs.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "PHONE_TYPE")
public class PhoneType {
	
	@Id
	@SequenceGenerator(name="id_Sequence", sequenceName="seq_ptype", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@Column(name = "PTY_ID")
	private Integer phoneTypeId;
	
	@Column(name = "PHONE_TYPE")
	private String phoneType;

//	===========================================================================
	
	public Integer getPhoneTypeId() {
		return phoneTypeId;
	}

	public void setPhoneTypeId(Integer phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
}
