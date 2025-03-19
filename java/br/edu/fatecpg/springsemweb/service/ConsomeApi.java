package br.edu.fatecpg.springsemweb.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    public static void obterMarcas(String url) throws IOException, InterruptedException {
        String jsonResponse = obterDados(url);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonResponse);

        for (JsonNode node : rootNode) {
            String codigo = node.path("codigo").asText();
            String nome = node.path("nome").asText();
            System.out.println("ID: " + codigo + ", Nome: " + nome);
        }
    }

    public static void obterModelos(String marcaCodigo) throws IOException, InterruptedException {
        String urlModelos = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marcaCodigo + "/modelos";
        String modelosJson = obterDados(urlModelos);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(modelosJson);

        for (JsonNode node : rootNode) {
            String codigo = node.path("codigo").asText();
            String nome = node.path("nome").asText();
            System.out.println("ID: " + codigo + ", Nome: " + nome);
        }
    }
}
