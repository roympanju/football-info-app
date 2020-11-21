package com.football.analysis.config.competitionData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Competition {
    
    @JsonProperty("id")
    public String id;

    @JsonProperty("area")
    public Area area;

    @JsonProperty("name")
    public String name;

    @JsonProperty("code")
    public String code;

    @JsonProperty("emblemUrl")
    public String emblemUrl;

    @JsonProperty("plan")
    public String plan;

    @JsonProperty("currentSeason")
    public Season currentSeason;

    @JsonProperty("numberOfAvailableSeasons")
    public String numberOfAvailableSeasons;

    @JsonProperty("lastUpdated")
    public String lastUpdated;

}