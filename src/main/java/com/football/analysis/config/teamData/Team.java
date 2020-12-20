package com.football.analysis.config.teamData;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.football.analysis.config.competitionData.Area;

@JsonInclude(Include.NON_NULL)
public class Team {

    @JsonProperty("id")
    public String id;
    
    @JsonProperty("area")
    public Area area;

    @JsonProperty("name")
    public String name;

    @JsonProperty("shortName")
    public String shortName;

    @JsonProperty("tla")
    public String tla;

    @JsonProperty("crestUrl")
    public String crestUrl;

    @JsonProperty("address")
    public String address;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("website")
    public String website;

    @JsonProperty("email")
    public String email;

    @JsonProperty("founded")
    public String founded;

    @JsonProperty("clubColors")
    public String clubColors;

    @JsonProperty("venue")
    public String venue;

    @JsonProperty("lastUpdated")
    public String lastUpdated;   
}
