package com.vtellez.apps.design.patterns.builder;

/**
 * This class represents the age range of the user.
 *
 * Created by Victor Tellez on 18/11/2015.
 */
public enum  AgeRange {

    ADOLESCENT("adolescent-10-19"),
    ADULT("adult-20-45"),
    MIDDLE("middle-46-60"),
    OLD("old>60");

    private String ageRange;

    AgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    @Override
    public String toString() {
        return ageRange;
    }
}
