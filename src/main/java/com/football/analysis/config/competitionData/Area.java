package com.football.analysis.config.competitionData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Area {
    
    @JsonProperty("id")
    public String id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("countryCode")
    public String countryCode;

    @JsonProperty("ensignUrl")
    public String ensignUrl;
}
