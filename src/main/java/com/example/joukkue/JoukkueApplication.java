package com.example.joukkue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.joukkue.domain.Joukkue;
import com.example.joukkue.domain.JoukkueRepository;

@SpringBootApplication
public class JoukkueApplication {

	private static final Logger log = LoggerFactory.getLogger(JoukkueApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JoukkueApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(JoukkueRepository joukkuerepo) {
		return (args) -> {
			log.info("");

			log.info("");
			for (Joukkue joukkue : joukkuerepo.findAll()) {
				log.info(joukkue.toString());
			}
		};
	}
}
