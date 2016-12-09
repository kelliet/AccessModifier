package com.company.com.company.smallDogs;

/**
 * Created by kellie on 12/9/16.
 */
public class Poodle {


    //noise and howl() are not explicitly defined as private, public, or protected.  Therefore the default
    //is package private and can only be accessed by classes in the same package
    String noise = "howl";
    void howl() {
        System.out.println(noise);
    }

    private void makeHowl() {
        howl();
    }
}
