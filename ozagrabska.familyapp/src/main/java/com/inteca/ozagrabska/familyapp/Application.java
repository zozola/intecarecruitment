package com.inteca.ozagrabska.familyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@SpringBootApplication
@RestController
public class Application {
	
	@Autowired
	private FamilyRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/CreateFamily")
	public String CreateFamily() {
		return "Not supported";
	}

	@GetMapping(path="/GetFamily")
	public String GetFamily(@RequestParam String id) {
		Optional<Family> family = repository.findById(Integer.parseInt(id));

		return String.format("Rodzina o numerze %s %s", id, family.isPresent() ? "istnieje" : "nie istnieje");
	}
}
