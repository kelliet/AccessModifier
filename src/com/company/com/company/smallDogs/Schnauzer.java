package com.company.com.company.smallDogs;

import com.company.com.company.largeDogs.LargeDogs;

/**
 * Created by kellie on 12/9/16.
 */
public class Schnauzer {

    public void chaseBird() {
        LargeDogs largeDogs = new LargeDogs();
        //largeDogs.makeBark();  //This doesn't work because the access is protected.
       // System.out.println(largeDogs.bark);  //This doesn't work because the access is protected.
    }
}
