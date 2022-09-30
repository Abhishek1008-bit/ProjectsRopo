package in.serosoft.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.serosoft.rest.entity.Emp;

@RestController
public class TestController {
	
	@GetMapping(value = "welcome")
	public String welcome() {
		return "Welcome User";
	}
	
	
}
