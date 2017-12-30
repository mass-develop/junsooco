package com.maunt.myapplication.Sort;

import com.maunt.myapplication.Home.ListObj;

import java.util.Comparator;

/**
 * Created by Sourav on 28-06-2017.
 */

public class Sortprice implements Comparator<ListObj> {


    @Override
    public int compare(ListObj o1, ListObj o2) {
        double d1 = new Double(Double.parseDouble(o1.gethJsonLastPrice()));
        double d2= new Double(Double.parseDouble(o2.gethJsonLastPrice()));

        if(d1==d2)
            return 0;
        else if(d1>d2)
            return 1;
        else
            return -1;
    }




}