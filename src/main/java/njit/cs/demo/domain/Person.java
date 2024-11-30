package njit.cs.demo.domain;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "PERSON")
public class Person {
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "PWD")
	private String password;
	
	@Column(name = "SSN")
	private Integer ssn;
	
	@Column(name = "UID")
	private String uid;
	
	@Column(name = "BIRTH_DAY")
	private Date birthday;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PER_ID")
	private Integer personId;
	
	@Column(name = "PERT_ID")
	private Integer personTypeId;

	//Table Mapping
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADD_ID")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="PER_ID" )
	private Set<Phones> phones;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="PER_ID" )
	private Set<EmgContact> emgContact;
	

	// Setters & Getters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getPersonTypeId() {
		return personTypeId;
	}

	public void setPersonTypeId(Integer personTypeId) {
		this.personTypeId = personTypeId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Phones> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phones> phones) {
		this.phones = phones;
	}
	
	public Set<EmgContact> getEmgContact() {
		return emgContact;
	}

	public void setEmgContact(Set<EmgContact> emgContact) {
		this.emgContact = emgContact;
	}

	
}
