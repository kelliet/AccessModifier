package com.company.com.company.mediumDogs;

/**
 * Created by kellie on 12/9/16.
 */
public class Beagle {

    //private can only be accessed within the same class

    private String noise = "howl";
    private void howl() {
        System.out.println(noise);
    }

    private void makeHowl() {
        howl();
    }

}
