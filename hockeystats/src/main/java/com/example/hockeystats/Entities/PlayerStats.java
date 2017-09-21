package com.example.hockeystats.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PlayerStats {


    private int statId;

    private int gamesPlayed;

    private int goals;

    private int assists;

    private int points;

    private int pim;

    private int ppg;

    private int ppp;

    private int shp;

    private int shotPer;

    public PlayerProfile playerProfile;

    public PlayerStats(int statId, int gamesPlayed, int goals, int assists,
                       int points, int pim, int ppg, int ppp, int shp, int shotPer, PlayerProfile playerProfile) {
        this.statId = statId;
        this.gamesPlayed = gamesPlayed;
        this.goals = goals;
        this.assists = assists;
        this.points = points;
        this.pim = pim;
        this.ppg = ppg;
        this.ppp = ppp;
        this.shp = shp;
        this.shotPer = shotPer;
        this.playerProfile = playerProfile;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPim() {
        return pim;
    }

    public void setPim(int pim) {
        this.pim = pim;
    }

    public int getPpg() {
        return ppg;
    }

    public void setPpg(int ppg) {
        this.ppg = ppg;
    }

    public int getPpp() {
        return ppp;
    }

    public void setPpp(int ppp) {
        this.ppp = ppp;
    }

    public int getShp() {
        return shp;
    }

    public void setShp(int shp) {
        this.shp = shp;
    }

    public int getShotPer() {
        return shotPer;
    }

    public void setShotPer(int shotPer) {
        this.shotPer = shotPer;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }
}
