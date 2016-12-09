package com.company.com.company.mediumDogsWater;

import com.company.com.company.largeDogs.LargeDogs;

/**
 * Created by kellie on 12/9/16.
 */
public class GoldenRetriever extends LargeDogs {

    //allows protected access because we have extended LargeDogs, package private and superclass
    public void chaseBird() {
        makeBark();
        System.out.println(bark);
    }

    public void helpLabrador() {
        LargeDogs largeDogs = new LargeDogs();
       // largeDogs.makeBark();  //even though we have extended largedogs, we still cannot instantiate
        //largeDogs and use the protected methods or variables.
        //System.out.println(bark);

    }
}
