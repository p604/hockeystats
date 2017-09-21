package com.example.hockeystats.Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlayerEventId {

    @Column(name = "Player_ID")
    private int playerId;

    @Column(name = "Game_ID")
    private int gameId;
}
