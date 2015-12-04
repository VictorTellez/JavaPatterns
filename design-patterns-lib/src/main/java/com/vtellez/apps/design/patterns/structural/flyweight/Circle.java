package com.vtellez.apps.design.patterns.structural.flyweight;

/**
 * This class represents the shape circle.
 *
 * Created by Victor Tellez on 04/12/2015.
 */
public class Circle implements Shape {
    /**
     * The color of the circle.
     */
    private String color;

    /**
     * Position values.
     */
    private int x;
    private int y;

    /**
     * Constructor.
     *
     * @param color of the circle
     */
    public Circle(String color) {
        this.color = color;
    }

    /**
     * Gets the coordinate x.
     *
     * @return  position x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the coordinate x.
     *
     * @param x     position to be set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the coordinate y.
     *
     * @return  position y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the coordinate y.
     *
     * @param y     position to be set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Draws the shape.
     */
    @Override
    public void draw() {
        System.out.println("Circle Draw Color: " + color);
    }
}
