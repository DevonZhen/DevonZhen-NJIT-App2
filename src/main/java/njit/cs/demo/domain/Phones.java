package njit.cs.demo.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "PHONES")
public class Phones {
	
	@Id
	@SequenceGenerator(name="id_Sequence", sequenceName="seq_phones", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@Column(name = "PH_ID")
	private Integer phoneId;
	
	@Column(name = "PHONE")
	private String phone;
	
//    @Column(name = "PTY_ID")
//	private Integer phoneType;
    
    @Column(name = "PH_TYPE")
	private String  phoneType;

//	===========================================================================
    
	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

//	public Integer getPhoneType() {
//		return phoneType;
//	}
//
//	public void setPhoneType(Integer phoneType) {
//		this.phoneType = phoneType;
//	}

}
