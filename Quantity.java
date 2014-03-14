package edu.berkeley.ischool.aep;

/**
 * Created by vanwars on 2/7/14.
 */
public class Quantity {

    private double size;
    private enum Units { INCHES, FEET; }
    private Units units;

    


    private Quantity(double size, Units units) {
        this.size = size;
        this.units = units;
    }

    public static Quantity Inches(double inches) {
        return new Quantity(inches, Units.INCHES);
    }

    public static Quantity Feet(double feet) {
        return new Quantity(feet*12, Units.FEET);
    }

    public boolean equals(Object other) {
        if(other == this) return true;

        if (!(other instanceof Quantity)) return false;
        double result = size - ((Quantity)other).size;
        if(result < .0000000001)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        long longBits = Double.doubleToLongBits(size);
        return (int)(longBits ^ longBits >>>32);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                units + "=" + size +
                '}';
    }

}
