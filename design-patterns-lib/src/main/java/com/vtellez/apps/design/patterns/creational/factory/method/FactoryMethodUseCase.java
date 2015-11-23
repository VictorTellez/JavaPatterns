package com.vtellez.apps.design.patterns.factory.method;

/**
 * This class shows a use case of the Factory method pattern design.
 * The Factory Method is a creational design pattern which uses factory methods to deal with the
 * problem of creating objects without specifying the exact class of object that will be created.
 * This is done by creating objects via calling a factory method either specified in an interface
 * and implemented by child classes, or implemented in a base class and optionally overridden by
 * derived classes—rather than by calling a constructor.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public class FactoryMethodUseCase {

   public static void useFactoryUseCase() {
      Graphics graphics = new SwingGraphics();
      Shape shape = graphics.createShape(BorderType.SOLID);
      System.out.println(shape);

      shape = graphics.createShape(BorderType.DOTTED);
      System.out.println(shape);

      shape = graphics.createShape(BorderType.NONE);
      System.out.println(shape);
   }
}
