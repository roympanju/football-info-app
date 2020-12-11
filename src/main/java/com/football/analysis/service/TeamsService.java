package com.football.analysis.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.analysis.config.requestConfig.CompetitionRequestConfig;
import com.football.analysis.config.teamData.Team;
import com.football.analysis.config.teamData.Teams;

import org.springframework.stereotype.Service;

@Service
public class TeamsService {
    
    ObjectMapper mapper = new ObjectMapper();
    private Teams teams = new Teams();
    private CompetitionRequestConfig requestConfig = new CompetitionRequestConfig();

    public List<String> teamsInCompetition(String competitionId, String compTeams){
        try {
            //System.out.println(requestConfig.sendRequest());
            teams = mapper.readValue(requestConfig.sendRequest(competitionId, compTeams), Teams.class);
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