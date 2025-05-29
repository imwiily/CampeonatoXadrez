package com.wiily.CampeonatoXadrez;

import com.wiily.CampeonatoXadrez.main.MainMethod;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CampeonatoXadrezApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CampeonatoXadrezApplication.class, args);
	}
	@Override
	public void run(String... args) {
		MainMethod main = new MainMethod();
		main.XadrezMain();
	}
}
