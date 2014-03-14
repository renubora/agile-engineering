package edu.berkeley.ischool.aep;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by honestyhuang on 3/7/14.
 */
public class ReverseTest {
    @Test
    public void testReverse() {
        assertEquals("abcdefg",  Reverser.reverse("gfedcba"));
    }
}
