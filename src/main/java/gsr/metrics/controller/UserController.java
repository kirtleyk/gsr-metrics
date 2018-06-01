package gsr.metrics.controller;

import gsr.metrics.Repository.UserRepository;
import gsr.metrics.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class UserController {
	@Autowired
	private UserRepository repo;
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET, produces="application/json")
	public User findById(@PathVariable("id") Long id) {

	//User thisUser = repo.findById(id).get();
	return repo.findById(id).get();
	}
	
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public Iterable<User> getAll() {
		return repo.findAll();
	}
	
}
