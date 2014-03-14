package edu.berkeley.ischool.aep;

// import sun.awt.UNIXToolkit;

/**
 * Created by galahad on 2/14/14.
 */
public class Unit {
    public static Unit INCHES = new Unit (1, "Inches");
    public static Unit FEET = new Unit(1*12, "Feet");
    public static Unit YARDS = new Unit(3*12, "Yards");
    public static Unit MILES = new Unit(1760 *3*12, "Miles");
    public static Unit TEASPOON = new Unit(1,"Teaspoon");
    public static Unit TABLESPOON = new Unit(3,"Tablespoon");
    public static Unit OUNCES = new Unit(2*3,"Ounces");
    public static Unit CUP = new Unit(8*2*3,"CUP");

    public static Unit FAHRENHEIT = new Unit (1, "Fahrenheit");
    public static Unit CELSIUS = new Unit ((1*9/5)+32, "Celsius");


    private final float conversionFactor;
    private String name;

    private Unit(float conversionFactor, String name) {
        this.conversionFactor = conversionFactor;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public float convertTo(float size, Unit otherUnit) {
        System.out.println (size * conversionFactor / otherUnit.conversionFactor);
        return size * conversionFactor / otherUnit.conversionFactor;
    }
}
