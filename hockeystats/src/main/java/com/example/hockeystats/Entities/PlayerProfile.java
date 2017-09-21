package com.example.hockeystats.Entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class PlayerProfile {

    private int playerId;

    private String name;

    private String position;

    private int age;

    private int weight;

    private int dob;

    private String nationality;

    private TeamProfile teamProfiles;

    List<PlayerEvent> playerEvents;

    public PlayerProfile(String name, String position, int age, int weight, int dob, String nationality, TeamProfile teamProfiles,
                         List<PlayerEvent> playerEvents) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.weight = weight;
        this.dob = dob;
        this.nationality = nationality;
        this.teamProfiles = teamProfiles;
        this.playerEvents = playerEvents;
    }


    @OneToMany(targetEntity = PlayerEvent.class, mappedBy = "playerProfiles", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<PlayerEvent> getPlayerEvents() {
        return playerEvents;
    }

    public void setPlayerEvents(List<PlayerEvent> playerEvents) {
        this.playerEvents = playerEvents;
    }


    @Id
    @Column(name = "Player_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @ManyToOne
    @JoinColumn(name = "Team_Id")
    public TeamProfile getTeamProfile() {
        return teamProfiles;
    }

    public void setTeamProfile(TeamProfile teamProfile) {
        this.teamProfiles = teamProfile;
    }
}
