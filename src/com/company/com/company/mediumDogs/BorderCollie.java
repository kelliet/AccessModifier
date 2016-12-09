package com.company.com.company.mediumDogs;

/**
 * Created by kellie on 12/9/16.
 */
public class BorderCollie {

    //noise and howl() are not explicitly defined as private, public, or protected.  Therefore the default
    //is package private and can only be accessed by classes in the same package
    String noise = "howl";
    void howl() {
        System.out.println(noise);
        //makeHowl();
    }

    //can only be accessed by the class
    private void makeHowl() {
        howl();
    }
}
