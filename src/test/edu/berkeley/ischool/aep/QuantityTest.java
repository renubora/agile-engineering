package edu.berkeley.ischool.aep;

import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by honestyhuang on 2/7/14.
 */

public class QuantityTest {

    /*
    @Test
    public void oneTBSPEqualsToThreeTSP() {
        assertEquals(new Quantity(1, Unit.TBSPS), new Quantity(3, Unit.TSPS));
        assertEquals(new Quantity(1, Unit.OZS), new Quantity(6, Unit.TSPS));
        assertEquals(new Quantity(1, Unit.CUPS), new Quantity(16, Unit.TBSPS));
    }

    @Test
    public void twoInchesPlusTwoInchesEquaslFourInches() {
        Quantity twoInches = new Quantity(2, Unit.INCHES);
        assertEquals(new Quantity(4, Unit.INCHES), twoInches.add(twoInches));

    }

    @Test
    public void twoTBSPlusOneOzsEqualstwelveTsp() {
        Quantity twoTBSP = new Quantity(2, Unit.TBSPS);
        Quantity oneOZ = new Quantity(1, Unit.OZS);
        assertEquals(new Quantity(12, Unit.TSPS), twoTBSP.add(oneOZ));
    }


    @Test(expected = RuntimeException.class)
    public void twoInPlusEightOzsEqualstwelveTsp() {
        Quantity twoIn = new Quantity(2, Unit.INCHES);
        Quantity eightOZ = new Quantity(8, Unit.OZS);
        assertEquals(new arithmeticQuantity(Quantity(1, Unit.INCHES), twoIn.add(eightOZ));
    }


    @Test
    public void temperatureTest() {
        assertEquals(new Quantity(212, Unit.FAHRE), new Quantity(100, Unit.CELSIUS));
        assertEquals(new Quantity(32, Unit.FAHRE), new Quantity(0, Unit.CELSIUS));
    }
    */

    /*
    @Test
    public void testMoreThan() {
        assertTrue(new arithmeticQuantity(10, Unit.OZS).moreThan(new arithmeticQuantity(1, Unit.OZS)));
        assertFalse(new arithmeticQuantity(1, Unit.OZS).moreThan(new arithmeticQuantity(10, Unit.OZS)));
    }
    */

    @Test
    public void testBest() {
        arithmeticQuantity q1 = new arithmeticQuantity(10, Unit.OZS);
        arithmeticQuantity q2 = new arithmeticQuantity(15, Unit.OZS);
        arithmeticQuantity q3 = new arithmeticQuantity(20, Unit.OZS);

        assertEquals(new arithmeticQuantity(20, Unit.OZS), new Bester(q1, q2, q3).best());
    }
}
