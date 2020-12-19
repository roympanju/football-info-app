package com.football.analysis.config.standings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.football.analysis.config.competitionData.*;

public class Standings {
    
    @JsonProperty("filter")
    public Filter filter;

    @JsonProperty("competition")
    public Competition competition;

    @JsonProperty("season")
    public Season season;

    @JsonProperty("standings")
    public List<Standing> standings;
}
