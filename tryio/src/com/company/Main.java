package com.company;

import com.company.concurrencyandparallelism.FireServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        /*ValuteCounter v = new ValuteCounter();
        v.f();*/
       /* ReadAtFile read = new ReadAtFile();
        read.ds();*/
       /* AttemptStackOverFlowExeption a = new AttemptStackOverFlowExeption();
        a.f();*/
        /*AttemptOutOfMemoryException as = new AttemptOutOfMemoryException();
        as.r();*/
        /*SystemConsole s = new SystemConsole();
        s.dfg();*/
        /*implClass cl = new implClass();
        cl.methodRef("Vlad");*/
        /*UsersList.filterListByUsers();*/
        /*MovieList m = new MovieList();
        m.streamMovies();*/
        /*String str ="new string";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);*/
        FireServer r = new FireServer();
        Thread t = new Thread(r);
        t.start();
    }
}
