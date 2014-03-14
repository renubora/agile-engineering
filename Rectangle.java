package edu.berkeley.ischool.aep;

/**
 * Understands a four-sided figure with sides at right angles
 */
public class Rectangle {

    protected int width, height;
    protected int area;

    public Rectangle (){
        width = 1;
        height = 1;
        area= width*height;

    }

    public Rectangle (int width, int height) {
        width = width;
        height = height;
        area = width * height;

    }

    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }

    public int getArea () {
        return area;
    }
}
