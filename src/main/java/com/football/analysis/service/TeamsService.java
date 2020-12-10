package com.football.analysis.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.analysis.config.competitionData.CompetitionRequestConfig;
import com.football.analysis.config.teamData.Team;
import com.football.analysis.config.teamData.Teams;


public class TeamsService {
    
    ObjectMapper mapper = new ObjectMapper();
    Teams teams = new Teams();
    CompetitionRequestConfig requestConfig = new CompetitionRequestConfig();

    public List<String> teamsInCompetition(){
        try {
            //System.out.println(requestConfig.sendRequest());
            teams = mapper.readValue(requestConfig.sendRequest("PL", "teams"), Teams.class);
        }catch (IOException | InterruptedException e){
            System.out.println(e);
        }
       // int listLength = teams.teams.size();
        List<String> listOfCompetitionTeams = new ArrayList<String>();

        for(Team t: teams.teams){
            listOfCompetitionTeams.add(t.name);
        }

        return listOfCompetitionTeams;
    }
    
}