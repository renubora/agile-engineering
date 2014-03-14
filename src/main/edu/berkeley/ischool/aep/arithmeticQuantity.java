package edu.berkeley.ischool.aep;

/**
 * Created by honestyhuang on 2/21/14.
 */
public class arithmeticQuantity extends Quantity implements Bestable<arithmeticQuantity> {
    arithmeticQuantity(double value, Unit unit) {
        super(value, unit);
    }
    public arithmeticQuantity add(Quantity other) {
        double otherValue = other.unit.convertTo(other.value, this.unit);
        return new arithmeticQuantity(otherValue + this.value, this.unit);
    }
    public boolean moreThan(arithmeticQuantity other) {
        double otherValue = other.unit.convertTo(other.value, this.unit);
        return (this.value > otherValue);
    }
}
