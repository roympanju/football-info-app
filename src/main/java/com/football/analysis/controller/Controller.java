package com.football.analysis.controller;

import java.util.List;

import com.football.analysis.service.TeamsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final TeamsService competionTeams;

    public Controller(TeamsService competionTeams) {
        this.competionTeams = competionTeams;
    }

    @GetMapping("/teams")
    List<String> competitionTeams (@PathVariable String competition, @PathVariable String teams){
        return competionTeams.teamsInCompetition();
    }
    
}
