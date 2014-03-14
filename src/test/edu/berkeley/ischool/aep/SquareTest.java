package edu.berkeley.ischool.aep;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by honestyhuang on 2/7/14.
 */
public class SquareTest {

    @Test
    public void shouldReturnAreaOfTenForTwoByTwoSquare() {
        Square square = new Square(3);
        assertEquals(2*3, square.area());
    }
}
