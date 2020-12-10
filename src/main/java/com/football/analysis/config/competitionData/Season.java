package com.football.analysis.config.competitionData;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.football.analysis.config.standings.Winner;

public class Season {
    
    @JsonProperty("id")
    public int id;

    @JsonProperty("startDate")
    public String startDate;

    @JsonProperty("endDate")
    public String endDate;
    
    @JsonProperty("currentMatchday")
    public String currentMatchday;

    @JsonProperty("winner")
    public Winner winner;

}
