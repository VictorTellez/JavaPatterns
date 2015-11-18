package com.vtellez.apps.builder;

import org.apache.commons.lang3.text.WordUtils;

/**
 * This class represents the User who is the object to be built.
 *
 * Created by Victor Tellez on 18/11/2015.
 */
public class User {

    /**
     * User properties.
     */
    private SubscriptionType subscriptionType;
    private AgeRange ageRange;
    private Profession profession;
    private Hobby hobby;
    private Gender gender;

    /**
     * Gets the subscription type.
     *
     * @return  SubscriptionType
     */
    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Gets the age range.
     *
     * @return  AgeRange
     */
    public AgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * Gets the profession.
     *
     * @return  profession
     */
    public Profession getProfession() {
        return profession;
    }

    /**
     * Gets the hobby.
     *
     * @return  Hobby
     */
    public Hobby getHobby() {
        return hobby;
    }

    /**
     * Gets the gender.
     *
     * @return  Gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * To show the details of the user.
     *
     * @return  String
     */
    @Override
    public String toString() {
        String genderPron = "undefined";
        String genderPos = "undefined";

        StringBuilder sb = new StringBuilder();
        sb.append("This user is a ");

        if (gender == Gender.FEMALE) {
            genderPron = "she";
            genderPos = "her";
            sb.append("woman");
        } else {
            sb.append("man");
            genderPron = "he";
            genderPos = "him";
        }
        sb.append(". " +  WordUtils.capitalize(genderPron));
        sb.append(" in a ");
        sb.append(ageRange + " ");
        sb.append(". " + WordUtils.capitalize(genderPos));
        sb.append(" profession is ");
        sb.append(profession);
        sb.append(". " + WordUtils.capitalize(genderPos));
        sb.append(" hobby is ");
        sb.append(hobby);
        sb.append(". " + WordUtils.capitalize(genderPos));
        sb.append(" subscription is ");
        sb.append(subscriptionType + ".");
        return sb.toString();
    }

    /**
     * Constructor.
     *
     * @param builder   is the class use to build the user.
     */
    private User(UserBuilder builder) {
        this.profession = builder.profession;
        this.ageRange = builder.ageRange;
        this.gender = builder.gender;
        this.profession = builder.profession;
        this.hobby = builder.hobby;
        this.subscriptionType = builder.subscriptionType;
    }

    /**
     * This class is the user builder.
     */
    public static class UserBuilder {
        private SubscriptionType subscriptionType;
        private AgeRange ageRange;
        private Profession profession;
        private Hobby hobby;
        private Gender gender;

        /**
         * Constructor. The profession and the age range are mandatory.
         *
         * @param profession    of the user
         * @param ageRange      of the user
         */
        public UserBuilder(Profession profession, AgeRange ageRange) {
            if (profession == null || ageRange == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.ageRange = ageRange;
        }

        /**
         * Includes the gender.
         *
         * @param gender    of the user
         * @return          UserBuilder
         */
        public UserBuilder withGender(Gender gender){
            this.gender = gender;
            return this;
        }

        /**
         * Includes the hobby.
         *
         * @param hobby     of the user
         * @return          UserBuilder
         */
        public UserBuilder withHobby(Hobby hobby){
            this.hobby = hobby;
            return this;
        }

        /**
         * Includes the subcription.
         *
         * @param subscriptionType  of the user
         * @return                  UserBuilder
         */
        public UserBuilder withSubscription(SubscriptionType subscriptionType){
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * Builds an User.
         *
         * @return  User
         */
        public User build() {
            return new User(this);
        }

    }
}
