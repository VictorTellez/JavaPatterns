package com.vtellez.apps.design.patterns.structural.composite;

/**
 * This class is a use case example.
 *
 * Created by Victor Tellez on 24/11/2015.
 */
public class CompositeUseCase {
    public static void useComposite() {
        CompositeView compositeView = UIManager.composition();
        System.out.println("Number or children " + compositeView.count());
    }
}
