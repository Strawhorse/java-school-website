package com.jbr.javaschoolwebsite;

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
	public String sayHello(@RequestParam(value = "myName", defaultValue = "Goran") String name){
		return String.format("Hello %s!",name);
	}


//	Begin mapping web pages here to serve content
	@GetMapping("/home")
	public showIndex() {
		return index.html;
	}


}
