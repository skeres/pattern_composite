package com.sks.utils;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Composant {
    public String nom=null;

    public Composant (String nom){
        this.nom=nom;
    }

    public String afficheNom() {
       return ("je suis le composant "+this.getNom());
    }

    public String getNom() {
        return nom;
    }
}
