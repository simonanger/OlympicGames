package com.example.simonanger.myapplication.Competitors;

import com.example.simonanger.myapplication.Sport;

import java.util.ArrayList;

/**
 * Created by simonanger on 15/09/2017.
 */

public class Team extends Competitors {
    ArrayList<Athlete> athletes;
    int teamScore;

    public Team(Country country, Sport sport) {
        super(country, sport);
        this.athletes = new ArrayList<>();
        this.teamScore = 0;
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void addAthlete(Athlete athlete) {
        if(athlete.getSport() == this.getSport() && athlete.getCountry() == this.getCountry()){
        athletes.add(athlete);}
    }

    public void totalScore() {
        for(Athlete athlete : athletes) {
            int athleteScore = athlete.getPoints();
            teamScore += athleteScore;
        }

    }
}

//
//    int highestValue = Integer.MIN_VALUE;
//    Player winner = null;
//
//        for (Player player: players) {
//                int currentValue = player.getCard().getValue();
//                if (currentValue > highestValue) {
//                highestValue = currentValue;
//                winner = player;
//                }
//                }
//                return winner;