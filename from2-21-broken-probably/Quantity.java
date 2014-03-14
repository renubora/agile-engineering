package edu.berkeley.ischool.aep;

/**
 * Created by galahad on 2/14/14.
 */
public class Quantity {

    private Unit unit;
    private float size;

    public Quantity(Unit unit, float value) {
        this.unit = unit;
        this.size = value;
    }

    @Override
    public String toString() {
        return size + " " + unit;
    }

    @Override
    public boolean equals(Object other) {
        if(other == this) return true;
        if(!(other instanceof Quantity)) return false;
        Quantity otherQuantity = (Quantity) other;
        float otherValue = otherQuantity.convertTo(unit);
        // Renu debug effort
        // System.out.println(Math.abs(this.size - otherValue));
        return ((Math.abs(this.size - otherValue)) < .0001);
    }

    private float convertTo(Unit otherUnit) {
        return unit.convertTo(size, otherUnit);
    }

    public Quantity superAdd(Quantity other) {
          float converted = this.convertTo(other.unit);
          return new Quantity(unit,size +converted);
    }

    public boolean greaterthan(Quantity otherquantity) {
        return this.size > otherquantity.convertTo(this.unit);
    }
}
