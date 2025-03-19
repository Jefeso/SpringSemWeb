package br.edu.fatecpg.springsemweb;

import br.edu.fatecpg.springsemweb.service.ConsomeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class SpringsemwebApplication implements CommandLineRunner {

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(SpringsemwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bem-vindo ao sistema de consulta FIPE!");

		try {
			String url = "https://parallelum.com.br/fipe/api/v1/carros/marcas";
			ConsomeApi.obterMarcas(url);

			System.out.print("\nDigite o Código da Marca desejada: ");
			String codMarca = scan.nextLine();

			ConsomeApi.obterModelos(codMarca);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
