package com.football.analysis.config.teamData;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.football.analysis.config.competitionData.Competition;
import com.football.analysis.config.competitionData.Filter;
import com.football.analysis.config.competitionData.Season;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Teams {

    @JsonProperty("count")
    public String count;

    @JsonProperty("filters")
    public Filter filters;
    
    @JsonProperty("competition")
    public Competition competition;

    @JsonProperty("season")
    public Season season;

    @JsonProperty("teams")
    public List<Team> teams;

}
