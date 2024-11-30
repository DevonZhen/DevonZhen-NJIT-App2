package njit.cs.demo.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "PHONES")
public class Phones {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PH_ID")
	private Integer phoneId;
	
	@Column(name = "PTY_ID")
	private Integer phoneTypeId;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "PER_ID")
	private Integer personId;
	
	@Column(name = "PH_TYPE")
	private String phoneType;
	
	@OneToOne(mappedBy="phones")
	private Person person;
}
