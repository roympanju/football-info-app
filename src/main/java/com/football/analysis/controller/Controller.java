package com.football.analysis.controller;

import java.util.List;

import com.football.analysis.config.standings.Position;
import com.football.analysis.service.CompetitionService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/football")
public class Controller {

    private CompetitionService competitionService;

    public Controller(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }
    @GetMapping("/{competitionId}/teams")
    List<String> competitionTeams (@PathVariable String competitionId){
        return competitionService.teamsInCompetition(competitionId, "teams");
    }
    @GetMapping("/leaguestanding/{competitionId}/{standings}")
    List<Position> competitionStanding (@PathVariable String competitionId, @PathVariable String standings){
        return competitionService.competitionStandings(competitionId, standings);
    }
    @GetMapping("/competitions")
    List<String> listOfAllCompetitions(){
        return competitionService.listOfAllCompetitions();
    }
    
}
