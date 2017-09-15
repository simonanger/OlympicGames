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
public class SinglesTennisTest {

    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    SinglesTennis singlesTennis;
    Medal goldMedal = new Medal(MedalType.GOLD);
    Medal silverMedal = new Medal(MedalType.SILVER);
    Medal bronzeMedal = new Medal(MedalType.BRONZE);

    @Before
    public void before() {
        singlesTennis = new SinglesTennis(Sport.TENNIS);
        athlete1 = new Athlete(Country.FRANCE, Sport.TENNIS, "Big Steve", 15);
        athlete2 = new Athlete(Country.BRAZIL, Sport.TENNIS, "Classic Harrison", 10);
        athlete2 = new Athlete(Country.BRITAIN, Sport.TENNIS, "Nicky", 5);
    }


    @Test
    public void testMedalsStartEmpty() {
        assertEquals(0, singlesTennis.getMedals().size());
    }

    @Test
    public void testCompetitorsStartEmpty() {
        assertEquals(0, singlesTennis.getCompetitors().size());

    }

    @Test
    public void testGetSport() {
        assertEquals(Sport.TENNIS, singlesTennis.getSport());
    }

    @Test
    public void testAddMedals() {
        singlesTennis.addStartingMedals();
        assertEquals(3, singlesTennis.getMedals().size());
    }

    @Test
    public void testAddCompetitors() {
        singlesTennis.addCompetitors(athlete1);
        singlesTennis.addCompetitors(athlete2);
        assertEquals(2, singlesTennis.getCompetitors().size());
    }

    @Test
    public void awardMedals() throws Exception {

    }

    @Test
    public void decideWinner() throws Exception {

    }

}