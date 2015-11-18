package com.vtellez.apps.builder;

/**
 * Created by PC_02 on 18/11/2015.
 */
public enum  Hobby {

    ARTS_AND_CRAFTS("arts-and-crafts"),
    COLLECTING("collecting"),
    DANCING("dancing"),
    DRAMA("drama"),
    SPORTS("sports"),
    FOOD_AND_DRINK("food-and-drink");

    private String hobby;

    Hobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return hobby;
    }
}
