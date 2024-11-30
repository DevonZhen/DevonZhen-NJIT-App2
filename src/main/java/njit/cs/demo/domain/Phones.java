package njit.cs.demo.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "PHONES")
public class Phones {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PH_ID")
	private Integer phoneId;
	
//	@Column(name = "PTY_ID")
//	private Integer phoneTypeId;
	
	@Column(name = "PHONE")
	private String phone;
	
//	@Column(name = "PER_ID")
//	private Integer personId;
	
//	@Column(name = "PH_TYPE")
//	private String phoneType;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PTY_ID")
	private PhoneType phoneType;

	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

//	public Integer getPhoneTypeId() {
//		return phoneTypeId;
//	}
//
//	public void setPhoneTypeId(Integer phoneTypeId) {
//		this.phoneTypeId = phoneTypeId;
//	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

//	public Integer getPersonId() {
//		return personId;
//	}
//
//	public void setPersonId(Integer personId) {
//		this.personId = personId;
//	}
//
//	public String getPhoneType() {
//		return phoneType;
//	}
//
//	public void setPhoneType(String phoneType) {
//		this.phoneType = phoneType;
//	}

}
