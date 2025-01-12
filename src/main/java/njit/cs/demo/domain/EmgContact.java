package njit.cs.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "EMGCONTACT")
public class EmgContact {
	@Id
	@SequenceGenerator(name="id_Sequence", sequenceName="seq_emgcontact", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@Column(name = "ECT_ID")
	private Integer emgContactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_RELATION")
	private String contactRelation;
	
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name = "CONTACT_PHONE")
	private String contactPhone;
	
	@OneToOne
    @JoinColumn(name = "PER_ID")  
    @JsonBackReference  
	private Person person;
	
//	===========================================================================

	public Integer getEmgContactId() {
		return emgContactId;
	}

	public void setEmgContactId(Integer emgContactId) {
		this.emgContactId = emgContactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactRelation() {
		return contactRelation;
	}

	public void setContactRelation(String contactRelation) {
		this.contactRelation = contactRelation;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

}
