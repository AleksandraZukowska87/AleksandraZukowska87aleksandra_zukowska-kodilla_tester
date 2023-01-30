package com.kodilla.collections.sets.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        for (int i = 0; i < 10; i++){
            stamps.add(new Stamp("stamp1",15,15,true));
        }

        System.out.printf("Collection length: " + stamps.size());
    }
}
