package com.example.hockeystats.Entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Game {

    private int gameId;

    private TeamProfile teamProfiles;

    List<PlayerEvent> playerEvents;

    private String opposition;

    public Game(int gameId, TeamProfile teamProfiles, List<PlayerEvent> playerEvents, String opposition) {
        this.gameId = gameId;
        this.teamProfiles = teamProfiles;
        this.playerEvents = playerEvents;
        this.opposition = opposition;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @ManyToOne
    @JoinColumn(name = "Team_ID")
    public TeamProfile getTeamProfiles() {
        return teamProfiles;
    }


    public void setTeamProfiles(TeamProfile teamProfiles) {
        this.teamProfiles = teamProfiles;
    }


    @OneToMany(targetEntity = PlayerEvent.class, mappedBy = "game", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<PlayerEvent> getPlayerEvents() {
        return playerEvents;
    }

    public void setPlayerEvents(List<PlayerEvent> playerEvents) {
        this.playerEvents = playerEvents;
    }

    public String getOpposition() {
        return opposition;
    }

    public void setOpposition(String opposition) {
        this.opposition = opposition;
    }
}



