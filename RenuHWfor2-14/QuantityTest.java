package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Renu Bora on 2/11/14.
 */
public class QuantityTest {

    // Jez

    @Test
    public void threeFeetShouldEqualShouldEqualOneYard () {
        assertEquals(new Quantity(1, YARDS), new Quantity(3,FEET);
    }

    @Test
    public void OneThousandSomethingYardsShouldEqualOneMile () {
        assertEquals(new Quantity(1760, YARDS), new Quantity(1,MILES);
    }



    //


    @Test
    public void testIsEqualTwoUnits() {
        assertEquals(Quantity.FeetToInches(1), Quantity.Inches(12));
//      assertEquals(Quantity.Inches(12), new Quantity(2, "INCHES"));

        assertEquals(Quantity.YardstoFeet(1), Quantity.Feet(3));
        assertEquals(Quantity.MilesToYards(1), Quantity.Yards(1760));
        assertEquals(Quantity.TbsToTsp(1), Quantity.Tsp(3));
        assertEquals(Quantity.OzToTbsp(1), Quantity.Tbsp(2));
        assertEquals(Quantity.CupsToOz(1), Quantity.Oz(8));


//        NO assertEquals(SuperTest.RenuConverter(12, INCHES, LENGTH)),SuperTest.RenuConverter(1, FOOT, LENGTH));
//        assertEquals(SuperTest.SuperTester(new RenuConverter(1, CUPS, VOLUME)),SuperTest.SuperTester(new RenuConverter(8, OUNCES, VOLUME));
    }

    @Test
//    public void threeFeetShouldEqualOneYard () {
//        assertEqual
//    }


    /*
    Tests for Next Week

     3ft = 1 yard
     1760 yards = 1 mile
     1 tbsp = 3 tsp
     1 OZ = 2 tbsp
     8 OZ = 1 cup

    * */
}
