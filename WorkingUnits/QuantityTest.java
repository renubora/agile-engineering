package edu.berkeley.ischool.aep;


import static junit.framework.Assert.*;

import org.junit.Test;

/**
 * Created by galahad on 2/14/14.
 */
public class QuantityTest {

    @Test
    public void OneYardShouldEqualThreeFeet() {
        assertEquals(new Quantity(Unit.YARDS, 1), new Quantity(Unit.FEET, 3));

    }

    @Test
    public void OneTableSpoonShouldEqual3Teaspoons() {
        //assertEquals(new Quantity(Unit.TABLESPOON, 2), new Quantity(Unit.TEASPOON, 3));
        assertEquals(new Quantity(Unit.TABLESPOON, 1), new Quantity(Unit.TEASPOON, 3));

    }

    @Test
    public void OneCupShouldEqual16Tablespoons() {
        assertEquals(new Quantity(Unit.TABLESPOON, 16), new Quantity(Unit.CUP, 1));
    }

    @Test
    public void OneOzShouldEqual3Tablespoons() {
        assertEquals(new Quantity(Unit.OUNCES, 1), new Quantity(Unit.TABLESPOON, 3));
    }

    @Test
    public void TwoPlusTwoInchesShouldEqualFourInches(){
        //assertEquals(Quantity.superAdd(new Quantity(Unit.INCHES, 2),(new Quantity(Unit.INCHES, 2)), new Quantity(Unit.INCHES, 4)));
        assertEquals(new Quantity(Unit.INCHES,4),new Quantity(Unit.INCHES,2).superAdd(new Quantity(Unit.INCHES, 2)));
    }

    @Test(expected = RuntimeException.class)
    public void exceptinShouldfail() throws RuntimeException {
        assertEquals(new Quantity(Unit.TABLESPOON,4),new Quantity(Unit.INCHES,2).superAdd(new Quantity(Unit.INCHES, 2)));
    }

    
    /* HW 212 Fahrenheit = 100 celsius
        32 F = 0 C

        F to C
        C to F
        */


}
