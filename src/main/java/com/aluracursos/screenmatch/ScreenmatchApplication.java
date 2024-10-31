package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI= new ConsumoAPI();
		var json=consumoAPI.obtenerDatos("https://www.omdbapi.com/?i=tt3896198&apikey=30c383a1");
		System.out.println(json);
	}
}
