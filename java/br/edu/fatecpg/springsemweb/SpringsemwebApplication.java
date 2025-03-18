package br.edu.fatecpg.springsemweb;

import br.edu.fatecpg.springsemweb.service.ConsomeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringsemwebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringsemwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bem-vindo ao sistema de consulta FIPE!");

		try {
			// Exemplo: Consultar o preço de um carro (Fiat Argo 2025)
			String modeloPreco = ConsomeApi.obterModeloPreco("21", "10392", "2025-1");
			System.out.println("Preço do carro: " + modeloPreco);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
