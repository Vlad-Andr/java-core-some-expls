package com.company.dimension;

import com.sun.source.tree.Tree;

import java.text.DateFormat;
import java.util.*;

public class ValuteCounter{

        public void f() {

        House h1 = new House(1);
        House h2 = new House(2);
        House h3 = new House(3);
        House h4 = new House(4);
        House h5 = new House(5);
        House h6 = new House(6);
        House h7 = new House(7);

        ArrayList s = new ArrayList();
        s.add(h2);
        s.add(h1);
        s.add(h4);
        s.add(h3);
        s.add(h5);
        s.add(h7);
        s.add(h6);

        NumberCompare nc = new NumberCompare();
        s.sort(nc);

        System.out.println(s);

    }

}

