package io.lhdev.HouseBrew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class HouseBrewApplication {

	public static void main(String[] args) {

		SpringApplication.run(HouseBrewApplication.class, args);
	}

	@GetMapping
	public String home(){
		return "Hi. Welcome to HouseBrew";
	}

}
