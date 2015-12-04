package com.vtellez.apps.design.patterns.structural.flyweight;

/**
 * Created by Victor Tellez on 04/12/2015.
 */
public class FlyWeightUseCase {

    private static String[] randomColor = new String[]{"White", "Red", "Green", "Blue", "Black"};

    public static void main(String[] args) {

        for(int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRamdomColor());
            circle.draw();
        }
    }

    public static String getRamdomColor() {
        return randomColor[(int)(Math.random()*randomColor.length)];
    }
}
