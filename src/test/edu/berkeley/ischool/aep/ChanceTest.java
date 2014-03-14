package edu.berkeley.ischool.aep;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotSame;


/**
 * Created by honestyhuang on 1/24/14.
 */
public class ChanceTest {

    /*
    @Test
    public void oneChanceShouldNotBeEqualToAnother() {
        Chance coinToss = new Chance(0.5);
        Chance dieThrow = new Chance(1/6);
        assertEquals(coinToss, coinToss);
        assertFalse(dieThrow.equals(coinToss));
        assertEquals(new Chance(0.5), coinToss);

        assertEquals(new Chance(0), new Chance(1).not());
        assertEquals(new Chance(0.5), new Chance(0.5).not());
        assertEquals(new Chance(5/6), dieThrow.not());


        assertEquals(new Chance(0.5*0.5), new Chance(0.5).and(new Chance(0.5)));
    }
    */

    @Test
    public void testBest() {
        Chance c1 = new Chance(0.3);
        Chance c2 = new Chance(0.5);
        Chance c3 = new Chance(0.6);
        assertEquals(new Chance(0.6),  new Bester(c1, c2, c3).best());
    }
}