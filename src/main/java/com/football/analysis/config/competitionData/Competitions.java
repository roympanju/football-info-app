package com.football.analysis.config.competitionData;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Competitions {
    
    @JsonProperty("count")
    public int count;

    @JsonProperty("filters")
    public Filter filter;

    @JsonProperty("competitions")
    public List<Competition> competitionList;
}
