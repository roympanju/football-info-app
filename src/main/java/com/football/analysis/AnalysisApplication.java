package com.football.analysis;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.analysis.config.competitionData.CompetitionRequestConfig;
//import com.football.analysis.config.competitionData.Competitions;
import com.football.analysis.config.teamData.Teams;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;

@SpringBootApplication
public class AnalysisApplication {

	public static void main(String[] args) {

//		SpringApplication.run(AnalysisApplication.class, args);
		ObjectMapper mapper = new ObjectMapper();
		Teams teams = new Teams();
		CompetitionRequestConfig requestConfig = new CompetitionRequestConfig();
		try {
			//System.out.println(requestConfig.sendRequest());
			teams = mapper.readValue(requestConfig.sendRequest(), Teams.class);
		}catch (IOException | InterruptedException e){
			System.out.println(e);
		}

		//System.out.println(competitions.competitionList.get(0).name);
		System.out.println(teams.teams.get(02).name);

	}

}