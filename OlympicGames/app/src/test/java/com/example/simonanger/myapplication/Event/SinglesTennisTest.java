package com.example.simonanger.myapplication.Event;

import com.example.simonanger.myapplication.Competitors.Athlete;
import com.example.simonanger.myapplication.Competitors.Competitors;
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
    Athlete athlete4;
    Athlete athlete5;
    SinglesTennis singlesTennis;
    Medal goldMedal = new Medal(MedalType.GOLD);
    Medal silverMedal = new Medal(MedalType.SILVER);
    Medal bronzeMedal = new Medal(MedalType.BRONZE);

    @Before
    public void before() {
        singlesTennis = new SinglesTennis(Sport.TENNIS);
        athlete1 = new Athlete(Country.FRANCE, Sport.TENNIS, "Big Steve", 15);
        athlete2 = new Athlete(Country.BRAZIL, Sport.TENNIS, "Classic Harrison", 10);
        athlete3 = new Athlete(Country.BRITAIN, Sport.TENNIS, "Nicky", 5);
        athlete4 = new Athlete(Country.BRITAIN, Sport.TENNIS, "Maisie", 7);
        athlete5 = new Athlete(Country.BRITAIN, Sport.TENNIS, "Katie", 3);
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
    public void testAddCompetitors() {
        singlesTennis.addCompetitors(athlete1);
        singlesTennis.addCompetitors(athlete2);
        assertEquals(2, singlesTennis.getCompetitors().size());
    }

    @Test
    public void testCannotAddMoreThanFour() {
        singlesTennis.addCompetitors(athlete1);
        singlesTennis.addCompetitors(athlete2);
        singlesTennis.addCompetitors(athlete3);
        singlesTennis.addCompetitors(athlete4);
        singlesTennis.addCompetitors(athlete5);
        assertEquals(4, singlesTennis.getCompetitors().size());
    }

    @Test
    public void awardMedals() {
        singlesTennis.addCompetitors(athlete1);
        singlesTennis.addCompetitors(athlete2);
        singlesTennis.addCompetitors(athlete3);
        singlesTennis.awardMedals();
        assertEquals(1, athlete1.getMedal().size() );
    }

}