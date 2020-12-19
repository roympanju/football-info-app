package com.football.analysis.config.standings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Standing {
    
    @JsonProperty("stage")
    public String stage;

    @JsonProperty("type")
    public String type;

    @JsonProperty("group")
    public String group;

    @JsonProperty("table")
    public List<Position> table;
}
