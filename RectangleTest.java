package edu.berkeley.ischool.aep;

import org.junit.Test;

/**
 * Created by user on 1/24/14.
 */
public class RectangleTest {

    @Test
    public void ShouldReturnAreaofTen(){
        Rectangle rectangle = new Rectangle(5,2);
        assertEqual(3, rectangle.area());
    }

}
