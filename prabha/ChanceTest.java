package edu.berkeley.ischoo.aep;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;


import java.util.HashMap;
import java.util.Map;

public class ChanceTest{
//    @Test
//    public void shouldReturnChanceNotHappendingGivenChancePoint4(){
//        Chance c = new Chance(.4);
//        assertEquals(.6, c.getNotChance());
//    }

//    @Test
//    public void shouldReturnChanceNotHappendingGivenChancePoint4(){
//        assertEquals(new Chance(0.4), new Chance(0.4).not());
//    }


    @Test
    public void oneChanceShouldNotBeEqualtoAnother(){
        Chance coinToss = new Chance(.4);
        assertEquals(coinToss,coinToss);
        Chance dieThrow = new Chance(1/6);
        assertFalse(dieThrow.equals(coinToss));
        assertEquals(new Chance(0.4), coinToss);
        assertEquals(new Chance(1-1/6), dieThrow.not());

    }



    @Test
    public void equalsShouldWorkAccordingToContract(){

        Chance coinToss = new Chance(0.4);
        assertFalse(coinToss.equals(null));
        assertFalse(coinToss.equals(new Object()));

        Map map = new HashMap();
        map.put(new Chance(0.4), "Coin Toss");
        assertEquals("Coin Toss", map.get(new Chance(0.4)));

    }



}
