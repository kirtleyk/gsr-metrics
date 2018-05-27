package gsr.metrics.model;

import lombok.Data;

import javax.persistence.*;

@Data @Entity @Table(name="user", schema="public")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String emailAddress;

	public String toString() {
		return String.format("%s %s", firstName, lastName);
	}
}