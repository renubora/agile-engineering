package edu.berkeley.ischool.aep;

/**
 * Created by honestyhuang on 3/7/14.
 */
public class Reverser {
    public static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        }
        return reverse(s.substring(1) + s.charAt(0));
    }
}
