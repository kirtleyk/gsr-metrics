package gsr.metrics.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;

@RequiredArgsConstructor // creates constructor with required or final properties
@Entity @Table(name="user", schema="public")
public @Data class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NonNull String firstName;
	private @NonNull String lastName;
	private @NonNull String emailAddress;
	
	public User() {
	
	}
}
