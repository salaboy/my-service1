package com.salaboy.myservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyService1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyService1Application.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hi from services inside k8s!";
	}

}
