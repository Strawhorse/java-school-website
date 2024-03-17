package com.jbr.javaschoolwebsite;

import net.sf.jsqlparser.Model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class JavaSchoolWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSchoolWebsiteApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "name", required = false, defaultValue = " there... John") String name, Model model){

		return String.format("Hello %s!",name);
	}

//	test endpoint
	@GetMapping("/test")
	public String test() {
		return new String("Hello there. \n This is a test.");
	}


//	Spring will automatically serve index.html from main/resources/static as the homepage

}



