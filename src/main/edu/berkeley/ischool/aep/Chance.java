package edu.berkeley.ischool.aep;


/**
 * Understands a four-sided figure with sides at right angles
 */
public class Chance implements Bestable<Chance> {
    private final double happen;

    public Chance(double happen) {
        this.happen = happen;
    }

    public Chance not() {
        return new Chance(1-happen);
    }

    public Chance and(Chance c) {
        return new Chance(happen * c.happen);
    }

    public boolean moreThan(Chance c) {
        return (this.happen > c.happen);
    }



    // coinToss.equals(dieThrow);
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (Math.abs(this.happen - ((Chance) other).happen) < 0.001) return true;
        if (!(other instanceof Chance)) return false;
        return happen == ((Chance) other).happen;
    }

    @Override
    public String toString() {
        return "Value: " + this.happen;
    }


}