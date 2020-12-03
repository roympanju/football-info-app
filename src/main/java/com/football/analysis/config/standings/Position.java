package com.football.analysis.config.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.football.analysis.config.teamData.Team;

public class Position {

    @JsonProperty("position")
    public String position;

    @JsonProperty("team")
    public Team team;

    @JsonProperty("playedGames")
    public int playedGames;

    @JsonProperty("form")
    public String form;

    @JsonProperty("won")
    public int won;

    @JsonProperty("draw")
    public int draw;

    @JsonProperty("lost")
    public int lost;

    @JsonProperty("points")
    public int points;

    @JsonProperty("goalsFor")
    public int goalsFor;

    @JsonProperty("goalsAgainst")
    public int goalsAgainst;

    @JsonProperty("gaolDifference")
    public int goalDifference;
}
