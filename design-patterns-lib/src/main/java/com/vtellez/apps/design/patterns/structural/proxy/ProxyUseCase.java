package com.vtellez.apps.design.patterns.structural.proxy;

/**
 * This is an use case of the proxy pattern.
 *
 * Created by Victor Tellez on 08/12/2015.
 */
public class ProxyUseCase {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_img.png");
        // Loaded from disk
        image.display();
        // Image already in memory
        image.display();
    }
}
