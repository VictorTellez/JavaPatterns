package com.vtellez.apps.builder;

/**
 * This enum represents the subscription type of the user.
 *
 * Created by Victor Tellez on 18/11/2015.
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
