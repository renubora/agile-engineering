package edu.berkeley.ischool.aep;

/**
 * Created by vanwars on 1/24/14.
 */
import org.junit.Test;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.*;


public class ChanceTest {

    @Test
    public void testThatTwoChancesAreEqual(){
        Chance c1 = new Chance(0.5);
        Chance c2 = new Chance(0.5);
        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c1));
    }

    @Test
    public void equalsShouldWorkAccordingToContract() {
        //follow the rule of 7. No more than seven lines per test.
        Chance coinToss = new Chance(0.5);
        assertFalse(coinToss.equals(null));
        assertEquals(coinToss, new Chance(0.5));
    }

    @Test
    public void testAndIsIndependent() {
        Chance coinToss1 = new Chance(0.5);
        Chance coinToss2 = new Chance(0.5);
        Chance result = new Chance(0.5*0.5);
        assertEquals(result, coinToss1.and(coinToss2));
    }

    @Test
    public void testOrIsIndependent() {
        Chance coinToss1 = new Chance(0.2);
        Chance coinToss2 = new Chance(0.3);
        Chance result = new Chance(0.2 + 0.3 - 0.2*0.3);
        assertEquals(result, coinToss1.or(coinToss2));
    }


}

