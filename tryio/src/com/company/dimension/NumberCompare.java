package com.company.dimension;

import java.util.Comparator;

public class NumberCompare implements Comparator<House> {

    @Override
    public int compare(House o1, House o2) {
        if (o1.number%2==0&&o2.number%2==0){
            return 0;
        }else if (o1.number%2!=0&&o2.number!=0){
            return 1;
        } else return -1;
    }
}
