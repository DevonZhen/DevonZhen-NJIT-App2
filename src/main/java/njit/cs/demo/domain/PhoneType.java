package njit.cs.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "PHONE_TYPE")
public class PhoneType {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PTY_ID")
	private Integer phoneTypeId;
	
	@Column(name = "PHONE_TYPE")
	private String phoneType;
}
