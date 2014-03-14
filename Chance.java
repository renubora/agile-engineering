package edu.berkeley.ischool.aep;

import sun.font.TrueTypeFont;

import java.math.BigDecimal;

/**
 * Understands a four-sided figure with sides at right angles
 */
public class Chance {

    private final double probability;

    public Chance(double prob) {
        probability = prob;
    }

    public Chance not() {
        return new Chance(1-probability);
    }

    public Chance and(Chance other) {
        return new Chance(probability*other.probability);
    }

    public Chance or(Chance other) {
        //DeMorgan's Law: P(A) or P(B) = !(!P(A) and !P(B))
        Chance arg1 = this.not();
        Chance arg2 = other.not();
        Chance result = arg1.and(arg2);
        return result.not();
    }

    public boolean equals(Object other) {
        if(other == this) return true;

        if (!(other instanceof Chance)) return false;
        double result = probability - ((Chance)other).probability;
        if(result < .0000000001)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        long longBits = Double.doubleToLongBits(probability);
        return (int)(longBits ^ longBits >>>32);
    }

    @Override
    public String toString() {
        return "Chance{" +
                "probability=" + probability +
                '}';
    }


}
