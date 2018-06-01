package gsr.metrics.Repository;

import gsr.metrics.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long>{
	List<User> findDistinctByLastNameIgnoreCase(String last_name);
}

