package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    Klass klass = new Klass(32, "Spasibo", new int[]{23,25,12} );
        System.out.println(klass.getNomer()+" "+klass.getSlovo()+" "+ Arrays.toString(klass.getNomer2()));
    }
}
