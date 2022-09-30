package in.serosoft.rest.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {
	private String street;
	private String city;
}
