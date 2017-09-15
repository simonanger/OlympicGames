package com.example.simonanger.myapplication.Competitors;

import com.example.simonanger.myapplication.Sport;

/**
 * Created by simonanger on 15/09/2017.
 */

public class Athlete extends Competitors {
    String name;
    int points;

    public Athlete(Country country, Sport sport,
                   String name, int points) {
        super(country, sport);
        this.name = name;
        this.points = points;
    }


    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}