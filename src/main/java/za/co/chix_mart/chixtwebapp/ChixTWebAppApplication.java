package za.co.chix_mart.chixtwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("za.co.chix_mart")
public class ChixTWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChixTWebAppApplication.class, args);


	}

}
