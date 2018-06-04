package gsr.metrics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping ("/")
	public String home() {
		//User user;
		//user = new User("Kevin", "Kirtley", "kevin.kirtley@gmail.com");
		return "home/index.html";
	}
	
}



