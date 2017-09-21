package com.example.hockeystats.Entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class TeamProfile {

    private String teamName;

    private String location;

    private String stadium;

    private String coach;

    private List<PlayerProfile> playerProfiles;

    private List<Game> game;

    public TeamProfile(String teamName, String location, String stadium, String coach, List<PlayerProfile> playerProfiles, List<Game> game) {
        this.teamName = teamName;
        this.location = location;
        this.stadium = stadium;
        this.coach = coach;
        this.playerProfiles = playerProfiles;
        this.game = game;
    }

    @Id
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @OneToMany(targetEntity = PlayerProfile.class, mappedBy = "teamProfile", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<PlayerProfile> getPlayerProfiles() {
        return playerProfiles;
    }

    public void setPlayerProfiles(List<PlayerProfile> playerProfiles) {
        this.playerProfiles = playerProfiles;
    }

    @OneToMany(targetEntity = Game.class, mappedBy = "teamProfiles", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }
}
