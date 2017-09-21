package com.example.hockeystats.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PlayerEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerEventId;

    @ManyToOne
    @JoinColumn(name = "Player_ID")
    private PlayerProfile playerProfiles;

    @Enumerated(EnumType.STRING)
    private PlayerAction playerAction;

    private String eventTime;

    @ManyToOne
    @JoinColumn(name = "Game_ID")
    private Game game;

    public PlayerEvent(int playerEventId, PlayerProfile playerProfiles, PlayerAction playerAction, String eventTime, Game game) {
        this.playerEventId = playerEventId;
        this.playerProfiles = playerProfiles;
        this.playerAction = playerAction;
        this.eventTime = eventTime;
        this.game = game;
    }

    public int getPlayerEventId() {
        return playerEventId;
    }

    public void setPlayerEventId(int playerEventId) {
        this.playerEventId = playerEventId;
    }

    public PlayerProfile getPlayerProfiles() {
        return playerProfiles;
    }

    public void setPlayerProfiles(PlayerProfile playerProfiles) {
        this.playerProfiles = playerProfiles;
    }

    public PlayerAction getPlayerAction() {
        return playerAction;
    }

    public void setPlayerAction(PlayerAction playerAction) {
        this.playerAction = playerAction;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
