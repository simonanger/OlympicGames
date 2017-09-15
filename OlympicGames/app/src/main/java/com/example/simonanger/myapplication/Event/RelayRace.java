package com.example.simonanger.myapplication.Event;

import com.example.simonanger.myapplication.Competitors.Athlete;
import com.example.simonanger.myapplication.Competitors.Competitors;
import com.example.simonanger.myapplication.Competitors.Team;
import com.example.simonanger.myapplication.Medal;
import com.example.simonanger.myapplication.MedalType;
import com.example.simonanger.myapplication.Sport;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by simonanger on 15/09/2017.
 */

public class RelayRace implements Winnable {
    ArrayList<Medal> medals;
    ArrayList<Competitors> competitors;
    Sport sport;

    public RelayRace(Sport sport) {
        this.medals = new ArrayList<>();
        this.competitors = new ArrayList<>();
        this.sport = sport;
        addStartingMedals();
    }

    public void addStartingMedals() {
        Medal goldMedal = new Medal(MedalType.GOLD);
        Medal silverMedal = new Medal(MedalType.SILVER);
        Medal bronzeMedal = new Medal(MedalType.BRONZE);
        medals.add(goldMedal);
        medals.add(silverMedal);
        medals.add(bronzeMedal);
    }

    public ArrayList<Medal> getMedals() {
        return medals;
    }

    public ArrayList<Competitors> getCompetitors() {
        return competitors;
    }

    public Sport getSport() {
        return sport;
    }


    public void addTeam(Team team) {
        if (team.getSport() == this.getSport()){
            competitors.add(team);
        }
    }

    public void awardMedals() {
        Collections.sort(competitors);
        Collections.reverse(competitors);
        competitors.get(0).awardMedal(medals.get(0));
        competitors.get(1).awardMedal(medals.get(1));
        competitors.get(2).awardMedal(medals.get(2));
    }
}
