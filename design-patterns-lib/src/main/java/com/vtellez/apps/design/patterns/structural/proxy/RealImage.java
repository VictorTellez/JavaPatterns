package com.vtellez.apps.design.patterns.structural.proxy;

/**
 * This class represents a real Image.
 *
 * Created by Victor Tellez on 08/12/2015.
 */
public class RealImage implements Image {
    /**
     * File name of the image.
     */
    private String fileName;

    /**
     * Constructor.
     *
     * @param fileName of the image
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(fileName);
    }

    /**
     * Loads an image from disk.
     */
    private void loadImageFromDisk(String fileName) {
        System.out.println("Load the image from disk: " + fileName);
    }

    /**
     * Displays an image.
     */
    @Override
    public void display() {
        System.out.println("Displays the image: " + fileName);
    }
}
