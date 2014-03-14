package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by rahmanaicc on 2/7/14.
 */
public class QuantityTest {

    @Test
    public void TestUnitConversions(){
        assertEquals(new Quantity(1.0, Quantity.Units.FEET), new Quantity(12.0, Quantity.Units.INCHES));
        assertEquals(new Quantity(1.0, Quantity.Units.TBSP), new Quantity(3.0, Quantity.Units.TSP));
        assertEquals(new Quantity(1.0, Quantity.Units.OZ), new Quantity(2.0, Quantity.Units.TBSP));
        assertEquals(new Quantity(8.0, Quantity.Units.OZ), new Quantity(1.0, Quantity.Units.CUP));
//        assertEquals(new Quantity(6.0, Quantity.Units.TSP), new Quantity(1.0, Quantity.Units.OZ));


    }


    @Test
    public void TestAdditionOfUnits(){
        Quantity qty1 = new Quantity(2.0, Quantity.Units.INCHES);
        Quantity qty2 = new Quantity(4.0, Quantity.Units.INCHES);

//        assertEquals(qty2,qty1.add(qty1));

    }
  }
