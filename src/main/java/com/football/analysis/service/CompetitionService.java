package com.football.analysis.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.analysis.config.requestConfig.CompetitionRequestConfig;
import com.football.analysis.config.standings.Position;
import com.football.analysis.config.standings.Standings;
import com.football.analysis.config.teamData.Team;
import com.football.analysis.config.teamData.Teams;

import org.springframework.stereotype.Service;

@Service
public class CompetitionService {
    
    ObjectMapper mapper = new ObjectMapper();
    private Teams teams = new Teams();
    private Standings standings = new Standings();
    private CompetitionRequestConfig requestConfig = new CompetitionRequestConfig();

    public List<String> teamsInCompetition(String competitionId, String teamsRequest){
        try {
            //System.out.println(requestConfig.sendRequest());
            teams = mapper.readValue(requestConfig.sendCompetitionRequest(competitionId, teamsRequest), Teams.class);
        }catch (IOException | InterruptedException e){
            System.out.println(e);
        }
        List<String> listOfCompetitionTeams = new ArrayList<String>();
        for(Team t: teams.teams){
            listOfCompetitionTeams.add(t.name);
        }
        return listOfCompetitionTeams;
    }

    public List<Position> competitionStandings(String competitionId, String standingsRequest){
        try{
            standings = mapper.readValue(requestConfig.sendCompetitionRequest(competitionId, standingsRequest), Standings.class);
        }catch (IOException | InterruptedException e){
            System.out.println(e);
        }
        List<Position> competitionStanding = new ArrayList<Position>();
        for(int i=0; i<standings.standings.size(); i++){
            for (Position p: standings.standings.get(0).table){
                competitionStanding.add(p);
            }
        }
        return competitionStanding;
    }
}