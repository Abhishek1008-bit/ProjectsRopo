package in.serosoft.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Emp {
	@Id
	private int eno;
	private String ename;
	private int sal;
	private String desg;
	private Address address;
}
