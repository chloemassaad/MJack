package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Start {
    public static void main(String[] args) {
        int numeroTour = 0;

        ArrayList<String> nameDistrict = new ArrayList<>(); //on utilise une arraylist pour avoir les noms de districts au même endroit.
        nameDistrict.add("Pink");
        nameDistrict.add("Black");
        nameDistrict.add("Orange");
        nameDistrict.add("Purple");
        nameDistrict.add("Green");
        nameDistrict.add("Yellow");
        nameDistrict.add("Blue");
        nameDistrict.add("White");
        nameDistrict.add("Grey");
        Collections.shuffle(nameDistrict);//permet de mélanger nameDistrict pour avoir une nouvelle expérience à chaque partie.

        Detective sherlock = new Detective(); //on initialise l'objet sherlock, instance de détective. On fait de meme pour watson et toby
        sherlock.positionx = 0;
        sherlock.positiony = 1;

        Detective watson = new Detective();
        watson.positionx = 4;
        watson.positiony = 1;

        Detective toby = new Detective();
        toby.positionx = 2;
        toby.positiony = 4;

        System.out.printf("la position de Sherlock est (%d,%d)\n",sherlock.positionx, sherlock.positiony);
        System.out.printf("la position de Watson est (%d,%d)\n",watson.positionx, watson.positiony);
        System.out.printf("la position de Toby est (%d,%d)\n",toby.positionx, toby.positiony);
        System.out.println(nameDistrict);
    }
}
