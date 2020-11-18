package com.football.analysis.config;

import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Configuration
public class RequestConfig {
    HttpRequest httpRequest;
    FootballDataOrgApiProperties footballDataOrgApiProperties;

    public static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public String sendRequest () throws IOException, InterruptedException {
        httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.football-data.org/v2/competitions"))
                .headers("X-Auth-Token", footballDataOrgApiProperties.getApiToken())
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
