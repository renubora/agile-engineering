package edu.berkeley.ischool.aep;

import java.io.IOException;

/**
 * Created by honestyhuang on 2/7/14.
 */

// Understands unit equivalence
public class Quantity {
    protected double value;
    protected Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Quantity)) return false;

        Quantity otherQuantity = (Quantity) other;
        return this.value == otherQuantity.unit.convertTo(otherQuantity.value, this.unit); // convert to my unit
    }
}