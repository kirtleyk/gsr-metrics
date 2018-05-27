package gsr.metrics.controller;

import gsr.metrics.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatomoController {

	@RequestMapping("/")
	public String home() {
		User user = new User();
		user.setFirstName("Kevin");
		user.setLastName("Kirtley");
		return user.toString();
	}
	
	@RequestMapping("/matomo")
	public String getData() {
		return "This is the Matomo controller!";
	}


	
	
}



