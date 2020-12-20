package com.football.analysis.controller;

import java.util.List;

import com.football.analysis.config.standings.Position;
import com.football.analysis.service.CompetitionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final CompetitionService competionTeamsList;
    private final CompetitionService competitionStandingList;

    public Controller(CompetitionService competionTeamsList, CompetitionService competitionStandingList) {
        this.competionTeamsList = competionTeamsList;
        this.competitionStandingList = competitionStandingList;
    }
    @GetMapping("/football/{competitionId}/{teams}")
    List<String> competitionTeams (@PathVariable String competitionId, @PathVariable String teams){
        return competionTeamsList.teamsInCompetition(competitionId, teams);
    }
    @GetMapping("/{competitionId}/{standings}")
    List<Position> competitionStanding (@PathVariable String competitionId, @PathVariable String standings){
        return competitionStandingList.competitionStandings(competitionId, standings);
    }
    
}
