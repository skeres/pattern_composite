package com.sks.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

public class SousComposant extends Composant{

    public Collection<Composant> collectionComposants=null;

    public SousComposant(String nom){
        super(nom);
        if (this.collectionComposants==null) collectionComposants = new ArrayList<Composant>();
    }

    public void add(Composant composant){
        this.collectionComposants.add(composant);
    }

    public void remove(Composant composant){
        this.collectionComposants.remove(composant);
    }

    public Collection getComposant(int i) {
        return null;
    }

    public void getListComposants() {
        for(Composant c:this.collectionComposants) {
            Class[] cArg = new Class[1];
            cArg[0] = Composant.class;
            try {
                c.getClass().getDeclaredMethod("add", cArg);
                System.out.println("trouvé élément sous composant "+c.getNom());
                java.lang.reflect.Method method = c.getClass().getMethod("getListComposants");
                method.invoke(c,null);
            } catch (NoSuchMethodException e) {
                //on est sur un élement simple, pas d'erreur
                System.out.println("élément simple "+c.getNom());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
