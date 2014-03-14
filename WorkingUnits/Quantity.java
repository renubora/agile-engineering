package edu.berkeley.ischool.aep;

/**
 * Created by galahad on 2/14/14.
 */
public class Quantity {

    private Unit unit;
    private int size;

    public Quantity(Unit unit, int value) {
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
        int otherValue = otherQuantity.convertTo(unit);
        return this.size == otherValue;
    }

    private int convertTo(Unit otherUnit) {
        return unit.convertTo(size, otherUnit);
    }

    public Quantity superAdd(Quantity other) {
          int converted = this.convertTo(other.unit);
          return new Quantity(unit,size +converted);
    }
}
