package br.com.amorimlopes.tolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.amorimlopes.tolist.controller")
public class TolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TolistApplication.class, args);
	}

}
