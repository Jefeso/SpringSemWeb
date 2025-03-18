package br.edu.fatecpg.springsemweb.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeApi {

    private static final HttpClient client = HttpClient.newHttpClient();
    
    public static String obterDados(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }


    public static String obterModeloPreco(String marcaCodigo, String modeloCodigo, String anoModelo) throws IOException, InterruptedException {
        String url = "https://fipe.parallelum.com.br/api/v1/carros/marcas/" + marcaCodigo + "/modelos/" + modeloCodigo + "/anos/" + anoModelo;
        return obterDados(url);
    }
}
