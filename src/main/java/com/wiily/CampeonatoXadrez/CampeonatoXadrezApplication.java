package com.wiily.CampeonatoXadrez;

import com.wiily.CampeonatoXadrez.database.Data;
import com.wiily.CampeonatoXadrez.database.IdData;
import com.wiily.CampeonatoXadrez.main.MainMethod;
import com.wiily.CampeonatoXadrez.model.Id;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CampeonatoXadrezApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CampeonatoXadrezApplication.class, args);
	}
	@Override
	public void run(String... args) throws IOException {
		MainMethod main = new MainMethod();
		main.XadrezMain();


	}
}
