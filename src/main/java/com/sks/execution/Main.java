package com.sks.execution;

import com.sks.utils.Composant;
import com.sks.utils.ElementSimple;
import com.sks.utils.SousComposant;

public class Main {
    public static void main(String[] args) {
        System.out.println("begin");

        Composant salade = new ElementSimple("salade");
        Composant beurre = new ElementSimple("beurre");
        SousComposant menuVegetarien = new SousComposant("sandwich provencal");
        menuVegetarien.add(salade);
        menuVegetarien.add(beurre);

        Composant cremeFraiche=new ElementSimple("creme fraiche");
        Composant ciboulette = new ElementSimple("ciboulette");
        SousComposant sauceProvence = new SousComposant("sauceProvence");

        sauceProvence.add(cremeFraiche);
        sauceProvence.add(ciboulette);

        menuVegetarien.add(sauceProvence);


        //display content
        menuVegetarien.getListComposants();




        System.out.println("end");
    }
}
