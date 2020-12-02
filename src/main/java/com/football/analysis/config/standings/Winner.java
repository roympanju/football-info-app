package com.football.analysis.config.competitionData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Winner {
    
    @JsonProperty("id")
    public String id;

    @JsonProperty("name")   
    public String name;

    @JsonProperty("shortName")
    public String shortName;

    @JsonProperty("tla")
    public String tla;

    @JsonProperty("crestUrl")
    public String crestUrl;
}
