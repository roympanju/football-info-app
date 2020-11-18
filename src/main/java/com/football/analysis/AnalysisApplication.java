package com.football.analysis;

import com.football.analysis.config.RequestConfig;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class AnalysisApplication {

	public static void main(String[] args) {

//		SpringApplication.run(AnalysisApplication.class, args);
		RequestConfig requestConfig = new RequestConfig();
		try {
			System.out.println(requestConfig.sendRequest());
		}catch (IOException | InterruptedException e){
			System.out.println(e);
		}

	}

}