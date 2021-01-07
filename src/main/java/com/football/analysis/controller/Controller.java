package com.football.analysis.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.football.analysis.config.standings.Position;
import com.football.analysis.service.CompetitionService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/football")
public class Controller {

    private final CompetitionService competionTeamsList;
    private final CompetitionService competitionStandingList;

    public Controller(CompetitionService competionTeamsList, CompetitionService competitionStandingList) {
        this.competionTeamsList = competionTeamsList;
        this.competitionStandingList = competitionStandingList;
    }
    //@CrossOrigin
    @GetMapping("/{competitionId}/{teams}")
    List<String> competitionTeams (@PathVariable String competitionId){
        return competionTeamsList.teamsInCompetition(competitionId, "teams");
    }
    @GetMapping("/leaguestanding/{competitionId}/{standings}")
    List<Position> competitionStanding (@PathVariable String competitionId, @PathVariable String standings){
        return competitionStandingList.competitionStandings(competitionId, standings);
    }
    
}
