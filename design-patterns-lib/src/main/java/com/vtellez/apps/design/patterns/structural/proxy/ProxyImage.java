package com.vtellez.apps.design.patterns.structural.proxy;

/**
 * This class represents the proxy class to manage the real image.
 *
 * Created by Victor Tellez on 08/12/2015.
 */
public class ProxyImage implements Image {
    /**
     * Real image to manage.
     */
    private RealImage realImage;

    /**
     * File name of the image.
     */
    private String fileName;

    /**
     * Constructor.
     *
     * @param fileName  of the image
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Displays and image.
     */
    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
