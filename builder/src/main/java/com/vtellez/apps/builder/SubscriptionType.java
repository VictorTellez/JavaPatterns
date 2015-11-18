package com.vtellez.apps.builder;

/**
 * Created by PC_02 on 18/11/2015.
 */
public enum SubscriptionType {

    TRIAL("trial"),
    PREMIUM("premium"),
    GOLD("gold");

    private String subscriptionType;

    SubscriptionType(String subscriptionType){
        this.subscriptionType = subscriptionType;
    }

    @Override
    public String toString() {
        return this.subscriptionType;
    }
}
