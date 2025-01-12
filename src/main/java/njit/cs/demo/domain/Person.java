package njit.cs.demo.domain;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {
	
	@Id
	@SequenceGenerator(name="id_Sequence", sequenceName="seq_person", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@Column(name = "PER_ID")
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "PWD")
	private String password;
	
	@Column(name = "SSN")
	private Long ssn;
	
	@Column(name = "UID")
	private String uid;
	
	@Column(name = "BIRTH_DAY")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	
	@Column(name = "PERT_ID")
	private Long personTypeId;

//	===========================================================================
	//Table Mapping
	
	//Person(Foreign key:ADD_ID) --> Address(Primary key:ADD_ID)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADD_ID")
	private Address address;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PERT_ID")
//	private PersonType personType;
	
	//Person(Primary key:PER_ID) --> EmgContact(Foreign key:PER_ID)
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="PER_ID", referencedColumnName = "id")
//	private EmgContact emgContact;
	
	//JsonManagedReference is used with OneToOne annotation in JPA from Jackson Library
	// that is used for Bidirectional relationship  and if you get the looping JSON
	@OneToOne(mappedBy= "person", cascade = CascadeType.ALL)
	@JsonManagedReference
	private EmgContact emgContact;

	
	//Person(Primary key:PER_ID) --> Phones(Foreign key:PER_ID)
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="PER_ID" )
	private Set<Phones> phones;
	
//	===========================================================================
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

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPersonTypeId() {
		return personTypeId;
	}

	public void setPersonTypeId(Long personTypeId) {
		this.personTypeId = personTypeId;
	}
	

//	public PersonType getPersonType() {
//		return personType;
//	}
//
//	public void setPersonType(PersonType personType) {
//		this.personType = personType;
//	}

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
	
	public EmgContact getEmgContact() {
		return emgContact;
	}

	public void setEmgContact(EmgContact emgContact) {
		this.emgContact = emgContact;
	}

	
}
