package edu.berkeley.ischool.aep;

/**
 * Understands a four-sided figure with sides at right angles
 */
public class Rectangle {
    private int length;
    private int width;

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int area() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (this.length + this.width) * 2;
    }

/*
    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSquare() {
        return this.length == this.width;
    }
*/

}
