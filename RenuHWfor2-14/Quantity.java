package edu.berkeley.ischool.aep;

/**
 * Created by Renu Bora on 2/11/14.
 */

public class Quantity{
    private final int size;

    public Quantity(int size, Unit unit){

    }

    @Override
    public boolean equals(Object obj) {
        if (this == other) return true;
        if (!(other instanceof Quantity)) reutrn false;
        Quantity otherQuantity = (Quantity) other;
        return size == otherQuantity.convertTo(unit);
    }

    private double convertTo(Unit otherUnit){
        return size *
    }

    public double convertTo(int size, Unit otherUnit) {
        return unit.convertTo

        otherUnit.convertTo(size, otherUnit);
}




/*public class Quantity {

    private double size;
    private enum Units { INCHES, FEET, YARDS, MILES, TSP, TBSP, OZ, CUP ; }
    private Units units;


    private Quantity(double size) {
        this.size = size;
    }

    public static Quantity Inches(double inches) {
        return new Quantity(inches);
    }

    public static Quantity Feet(double feet) {
        return new Quantity(feet);
    }

    public static Quantity Yards(double yards) {
        return new Quantity(yards);
    }


    public static Quantity Tsp(double tsp) {
        return new Quantity(tsp);
    }

    public static Quantity Tbsp(double tbsp) {
        return new Quantity(tbsp);
    }

    public static Quantity Oz(double oz) {
        return new Quantity(oz);
    }


    public static Quantity FeetToInches(double feet) {
        return new Quantity(feet*12);
    }

    public static Quantity YardstoFeet(double yards) {
        return new Quantity(yards*3);
    }

    public static Quantity MilesToYards(double miles) {
        return new Quantity(miles*1760);
    }

    public static Quantity TbsToTsp(double tbs) {
        return new Quantity(tbs*3);
    }

    public static Quantity OzToTbsp(double oz) {
        return new Quantity(oz*2);
    }

    public static Quantity CupsToOz(double cups) {
        return new Quantity(cups*8);
    }


    public boolean equals(Object other) {
        if(other == this) return true;

        if (!(other instanceof Quantity)) return false;
        double result = Math.abs(size - ((Quantity)other).size);
        if(result < .0000000001)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        long longBits = Double.doubleToLongBits(size);
        return (int)(longBits ^ longBits >>>32);
    }

*//**/
 /*   @Override
    public String toString() {
        return "Quantity{" +
                units + "=" + size +
                '}';

    }
*//*

}
*/