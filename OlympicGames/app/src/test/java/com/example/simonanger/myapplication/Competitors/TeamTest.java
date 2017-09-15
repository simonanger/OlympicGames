package com.example.simonanger.myapplication.Competitors;

import com.example.simonanger.myapplication.Medal;
import com.example.simonanger.myapplication.MedalType;
import com.example.simonanger.myapplication.Sport;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by simonanger on 15/09/2017.
 */
public class TeamTest {

    Team team;
    Athlete athlete1;
    Athlete athlete2;
    Medal goldMedal = new Medal(MedalType.GOLD);
    Medal silverMedal = new Medal(MedalType.SILVER);

    @Before
    public void before() {
        athlete1 = new Athlete(Country.FRANCE, Sport.TENNIS, "Big Steve", 10);
        athlete2 = new Athlete(Country.FRANCE, Sport.TENNIS, "Classic Harrison", 5);
        team = new Team(Country.FRANCE, Sport.TENNIS);
        team.addAthlete(athlete1);
        team.addAthlete(athlete2);
        team.awardMedal(goldMedal);
        team.awardMedal(silverMedal);
        team.totalPoints();
    }

    @Test
    public void getAthletes() {
        assertEquals(2, team.getAthletes().size());

    }

    @Test
    public void getTeamScore() {
        assertEquals(15, team.getTeamPoints());

    }

    @Test
    public void testAddAthlete() {
        Athlete athlete3 = new Athlete(Country.FRANCE, Sport.TENNIS, "Micky", 3);
        team.addAthlete(athlete3);
        assertEquals(3, team.getAthletes().size());
    }

}