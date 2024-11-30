package njit.cs.demo.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "PHONES")
public class Phones {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PH_ID")
	private Integer phoneId;
	
	@Column(name = "PHONE")
	private String phone;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PTY_ID")
	private PhoneType phoneType;

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

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

}
