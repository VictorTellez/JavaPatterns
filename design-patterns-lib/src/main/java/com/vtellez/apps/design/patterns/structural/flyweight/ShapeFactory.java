package com.vtellez.apps.design.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * Created by Victor Tellez on 04/12/2015.
 */
public class ShapeFactory {

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapeMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("Create circle color: " + color);
        }

        return circle;
    }
}
