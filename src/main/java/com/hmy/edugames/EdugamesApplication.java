package com.hmy.edugames;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My project API"))
public class EdugamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdugamesApplication.class, args);
	}

}
