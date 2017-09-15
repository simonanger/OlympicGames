package com.example.simonanger.myapplication.Event;

import com.example.simonanger.myapplication.Competitors.Athlete;
import com.example.simonanger.myapplication.Competitors.Country;
import com.example.simonanger.myapplication.Competitors.Team;
import com.example.simonanger.myapplication.Medal;
import com.example.simonanger.myapplication.MedalType;
import com.example.simonanger.myapplication.Sport;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by simonanger on 15/09/2017.
 */
public class RelayRaceTest {

    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Athlete athlete5;
    Athlete athlete6;
    Team team1;
    Team team2;
    Team team3;
    RelayRace relayRace;
    Medal goldMedal = new Medal(MedalType.GOLD);
    Medal silverMedal = new Medal(MedalType.SILVER);
    Medal bronzeMedal = new Medal(MedalType.BRONZE);

    @Before
    public void before() {
        relayRace = new RelayRace(Sport.RUNNING);
        athlete1 = new Athlete(Country.FRANCE, Sport.RUNNING, "Big Steve", 15);
        athlete2 = new Athlete(Country.FRANCE, Sport.RUNNING, "Classic Harrison", 10);
        athlete3 = new Athlete(Country.BRITAIN, Sport.RUNNING, "Nicky", 5);
        athlete4 = new Athlete(Country.BRITAIN, Sport.RUNNING, "Robby Robb", 15);
        athlete5 = new Athlete(Country.BRAZIL, Sport.RUNNING, "Danny Dan", 20);
        athlete6 = new Athlete(Country.BRAZIL, Sport.RUNNING, "Stewart", 15);
        team1 = new Team(Country.FRANCE, Sport.RUNNING);
        team2 = new Team(Country.BRITAIN, Sport.RUNNING);
        team3 = new Team(Country.BRAZIL, Sport.RUNNING);
    }

    @Test
    public void testCompetitorsStartEmpty() {
        assertEquals(0, relayRace.getCompetitors().size());

    }

    @Test
    public void testCanAddCompetitorsAndTeams() {
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete2);
        team2.addAthlete(athlete3);
        team2.addAthlete(athlete4);
        team3.addAthlete(athlete5);
        team3.addAthlete(athlete6);
        relayRace.addTeam(team1);
        relayRace.addTeam(team2);
        relayRace.addTeam(team3);
        assertEquals(3, relayRace.getCompetitors().size());
    }


    @Test
    public void awardMedals() {
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete2);
        team2.addAthlete(athlete3);
        team2.addAthlete(athlete4);
        team3.addAthlete(athlete5);
        team3.addAthlete(athlete6);
        relayRace.addTeam(team1);
        relayRace.addTeam(team2);
        relayRace.addTeam(team3);
        relayRace.awardMedals();
        assertEquals(1, team3.getMedal().size() );
    }

}