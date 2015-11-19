package com.vtellez.apps.design.patterns.builder;

/**
 * This enum represents the profession of the user.
 *
 * Created by Victor Tellez on 18/11/2015.
 */
public enum Profession {

    GOVERNMENT ("government"),
    PART_TIME("part-pime"),
    BUSINESS_OPPORTUNITIES("business-opportunities"),
    HEALTH_CARE("health-care"),
    RETAIL("retail"),
    CONTRACT_FREELANCE("contract-freelance");

    private String profession;

    Profession(String profession){
        this.profession = profession;
    }

    @Override
    public String toString() {
        return this.profession;
    }
}
