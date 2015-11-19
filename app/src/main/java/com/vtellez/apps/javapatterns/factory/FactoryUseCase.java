package com.vtellez.apps.javapatterns.factory;


import android.util.Log;

import com.vtellez.apps.design.patterns.factory.method.BorderType;
import com.vtellez.apps.design.patterns.factory.method.Graphics;
import com.vtellez.apps.design.patterns.factory.method.Shape;
import com.vtellez.apps.design.patterns.factory.method.SwingGraphics;


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
public class FactoryUseCase {

   private Graphics graphics;
   private Shape shape;

   public FactoryUseCase() {

      graphics = new SwingGraphics();
      shape = graphics.createShape(BorderType.SOLID);

      Log.i("Pattern Factory", "" + shape);
   }

}
