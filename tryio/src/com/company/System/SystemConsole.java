package com.company.System;

import java.io.Console;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SystemConsole {
    long nanoTime = System.currentTimeMillis();

    public void dfg() throws InterruptedException {


        for (int i = 0; i < 1000; i++) {
            i++;
            System.out.println(i);
        }

        long nanoTime2 = System.currentTimeMillis();
        System.out.println("Current nanoTime2 " + (nanoTime2 - nanoTime));

    }
}
