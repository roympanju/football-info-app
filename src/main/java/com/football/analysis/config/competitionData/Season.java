package com.football.analysis.config.competitionData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Season {
    
    @JsonProperty("id")
    public String id;

    @JsonProperty("startDate")
    public String startDate;

    @JsonProperty("endDate")
    public String endDate;
    
    @JsonProperty("currentMatchday")
    public String currentMatchday;

    @JsonProperty("winner")
    public Winner winner;

}
