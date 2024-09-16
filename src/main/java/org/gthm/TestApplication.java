package org.gthm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TestApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		RestTemplate template = new RestTemplate();
		String url = "https://self-signed.badssl.com";

		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		log.info("response status code: {}" , response.getStatusCode());
		log.info("response body: {} " , response.getBody());
		

	}

}