package gsr.metrics.controller;

import gsr.metrics.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatomoController {

	@RequestMapping("/")
	public String home() {
		User user;
		user = new User("Kevin", "Kirtley", "kevin.kirtley@gmail.com");
		return user.toString();
	}
	
	@RequestMapping("/matomo")
	public String getData() {
		return "This is the Matomo controller!";
	}


	
	
}



