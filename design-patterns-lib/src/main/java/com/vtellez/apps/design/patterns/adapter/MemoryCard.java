package com.vtellez.apps.design.patterns.adapter;

/**
 * This class represents the memory card which is use to save information.
 * Created by Victor Tellez on 19/11/2015.
 */
public class MemoryCard {
    /**
     * Creates a data.
     */
    void readData() {
        System.out.println("Read data in the memory card");
    }

    /**
     * Removes a data.
     */
    void writeData() {
        System.out.println("Write data into the memory card");
    }
}
