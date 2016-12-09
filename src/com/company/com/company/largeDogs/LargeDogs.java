package com.company.com.company.largeDogs;

/**
 * Created by kellie on 12/9/16.
 */
public class LargeDogs {

    //protected is package private but allows subclasses to access them
    protected String bark = "BARK";

    protected void makeBark() {
        System.out.println(bark);
    }
}
