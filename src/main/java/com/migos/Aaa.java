package com.migos;

import java.util.Date;

public class Aaa {
    public final Date d = new Date();

    public static void main(String[] args) {
        Aaa a = new Aaa();
        System.out.println(a.d);
        a.d.setHours(17);
        System.out.println(a.d);
        Ddd d1 = new Ddd();
        Ddd d2 = d1.setI(77);
        System.out.println(d1);
        System.out.println(d2);
    }
}

// Mutable

class Bbb {
    private int i = 0;

    public void setI(int i) {
        this.i = i;

    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}

// Immutable

class Ddd {
    private int i = 0;

    public Ddd setI(int i) {
        Ddd d = new Ddd();
        d.i = i;
        return d;

    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}