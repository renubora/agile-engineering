package edu.berkeley.ischool.aep;

/**
 * Created by honestyhuang on 2/14/14.
 */

// understands
public class Unit {
    public enum UnitType {LENGTH, VOLUME, TEMP}

    public static Unit FEET = new Unit(1, 0, "Feet", UnitType.LENGTH);
    public static Unit INCHES = new Unit(1, 0, "Inches", UnitType.LENGTH);
    public static Unit YARDS = new Unit(3, 0, "Yards", UnitType.LENGTH);
    public static Unit MILES = new Unit(1760*3, 0, "Miles", UnitType.LENGTH);

    public static Unit TSPS = new Unit(1, 0, "TSPS", UnitType.VOLUME);
    public static Unit TBSPS = new Unit(3, 0, "TBSPS", UnitType.VOLUME);
    public static Unit OZS = new Unit(2*3, 0, "Ounces", UnitType.VOLUME);
    public static Unit CUPS = new Unit(2*3*8, 0, "Cups", UnitType.VOLUME);

    public static Unit CELSIUS = new Unit(1, 0, "Celsius", UnitType.TEMP);
    public static Unit FAHRE = new Unit(5/9, 32, "Fahrenheit", UnitType.TEMP);


    private final double inBaseUnits;
    private final double shift;
    private final String name;
    private final UnitType type;

    public Unit(double inBaseUnits, double shift, String name, UnitType type) {
        this.inBaseUnits = inBaseUnits;
        this.shift = shift;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public double convertTo(double size, Unit otherUnit) {
        if (this.type != otherUnit.type)
            throw new RuntimeException();
        return (size-shift) * inBaseUnits / otherUnit.inBaseUnits;
    }
}
