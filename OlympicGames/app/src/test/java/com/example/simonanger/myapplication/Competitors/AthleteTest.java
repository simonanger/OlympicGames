package com.example.simonanger.myapplication.Competitors;

import com.example.simonanger.myapplication.Competitors.Athlete;
import com.example.simonanger.myapplication.Competitors.Country;
import com.example.simonanger.myapplication.Medal;
import com.example.simonanger.myapplication.MedalType;
import com.example.simonanger.myapplication.Sport;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by simonanger on 15/09/2017.
 */
public class AthleteTest {

    Athlete athlete;
    Medal goldMedal = new Medal(MedalType.GOLD);
    Medal silverMedal = new Medal(MedalType.SILVER);

    @Before
    public void before() {
        athlete = new Athlete(Country.FRANCE, Sport.TENNIS, "Big Steve", 10);
        athlete.awardMedal(goldMedal);
        athlete.awardMedal(silverMedal);
    }

    @Test
    public void canGetName() {
        assertEquals("Big Steve", athlete.getName());

    }

    @Test
    public void canGetPoints() {
        assertEquals(10, athlete.getPoints());
    }

    @Test
    public void canGetCountry() {
        assertEquals(Country.FRANCE, athlete.getCountry());
    }

    @Test
    public void canGetSport() {
        assertEquals(Sport.TENNIS, athlete.getSport());
    }

    @Test
    public void canCountMedals() {
        assertEquals(2, athlete.getMedal().size() );
    }

}