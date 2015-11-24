package com.vtellez.apps.design.patterns.builder;

/**
 * Example of the builder pattern.
 *
 * Created by Victor Tellez on 18/11/2015.
 */
public class BuilderUseCase {

    /**
     * Build Example.
     */
    public static void buildExample() {

        User workerUser = new User.UserBuilder(Profession.GOVERNMENT, AgeRange.MIDDLE)
                .withGender(Gender.FEMALE)
                .withHobby(Hobby.ARTS_AND_CRAFTS)
                .withSubscription(SubscriptionType.PREMIUM)
                .build();
        System.out.println(workerUser);

        User retailUser = new User.UserBuilder(Profession.RETAIL, AgeRange.OLD)
                .withGender(Gender.MALE)
                .withHobby(Hobby.COLLECTING)
                .withSubscription(SubscriptionType.TRIAL)
                .build();
        System.out.println(retailUser);

        User middleUser = new User.UserBuilder(Profession.BUSINESS_OPPORTUNITIES, AgeRange.MIDDLE)
                .withGender(Gender.FEMALE)
                .withHobby(Hobby.SPORTS)
                .withSubscription(SubscriptionType.GOLD)
                .build();
        System.out.println(middleUser);
    }
}
