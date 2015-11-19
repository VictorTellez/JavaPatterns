package com.vtellez.apps.design.patterns.builder;

/**
 * This enum represents the gender of the user.
 *
 * Created by Victor Tellez on 18/11/2015.
 */
public enum Gender {

    FEMALE("female"), MALE("male"), OTHER("other");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
