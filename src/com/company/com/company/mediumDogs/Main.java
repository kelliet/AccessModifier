package com.company.com.company.mediumDogs;

import com.company.com.company.smallDogs.Poodle;

public class Main {

    public static void main(String[] args) {

        Beagle beagle = new Beagle();
        // beagle.howl(); //does not work because access is private
        // System.out.println(beagle.howl);  //does not work because access if private

        BorderCollie lab = new BorderCollie();
        lab.howl();
        System.out.println(lab.noise);

        Poodle poodle = new Poodle();
        //poodle.howl(); //does not work because default access is package private
       //System.out.println(poodle.noise);  //does not work because default access is package private



    }
}
