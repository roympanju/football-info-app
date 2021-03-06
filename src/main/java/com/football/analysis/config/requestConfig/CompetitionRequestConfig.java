package com.football.analysis.config.requestConfig;

import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

//import com.football.analysis.config.FootballDataOrgApiProperties;

@Configuration
public class CompetitionRequestConfig {
    HttpRequest httpRequest;
    private final String url ="https://api.football-data.org/v2/competitions/";
    private final String token = "916bb95a78914b058e52d29c9d6abae7";
    //private FootballDataOrgApiProperties footballDataOrgApiProperties;

    public static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    
    public String sendCompetitionRequest (String competition, String request) throws IOException, InterruptedException {
        httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url+competition+"/"+request))
                .headers("X-Auth-Token", token)
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
    public String listCompetitionsRequest () throws IOException, InterruptedException {
        httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .headers("X-Auth-Token", token)
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        
        return response.body();
    }
}
