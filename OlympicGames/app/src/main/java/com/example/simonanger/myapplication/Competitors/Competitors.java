package com.example.simonanger.myapplication.Competitors;

import com.example.simonanger.myapplication.Medal;
import com.example.simonanger.myapplication.Sport;

import java.util.ArrayList;

/**
 * Created by simonanger on 15/09/2017.
 */

public abstract class Competitors implements Comparable<Competitors> {
    private Country country;
    private Sport sport;
    private ArrayList<Medal> medals;
    private int points;
    public Competitors(Country country, Sport sport) {
        this.country = country;
        this.sport = sport;
        this.medals = new ArrayList<>();
        this.points = 0;
    }

    public Country getCountry() {
        return country;
    }

    public Sport getSport() {
        return sport;
    }

    public int getPoints() {return points; }

    public ArrayList<Medal> getMedal() {
        return medals;
    }

    public void awardMedal(Medal medal) {
        medals.add(medal);
    }

    public int compareTo(Competitors otherCompetitor){
        if (this.getPoints() == otherCompetitor.getPoints()){
            return 0;
        }
        else
            return getPoints() > otherCompetitor.getPoints()? 1 : -1;
    }
}
