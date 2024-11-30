package njit.cs.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "EMGCONTACT")
public class EmgContact {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column(name = "PER_ID")
	private Integer personId;
}
