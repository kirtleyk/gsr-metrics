package gsr.metrics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatomoController {

	@RequestMapping("/matomo")
	public String getData() {
		return "This is the Matomo controller!";
	}
}



