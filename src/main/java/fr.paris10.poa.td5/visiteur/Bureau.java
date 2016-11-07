package fr.paris10.poa.td5.visiteur;

import java.util.ArrayList;

/**
 * Created by vabouque on 07/11/2016.
 */
public class Bureau implements ObjetBasique{

    private String name;
    private ArrayList<PetitObjetBasique> objets;

    public Bureau(String name) {
        this.name = name;
        this.objets = new ArrayList<>();
    }

    public Bureau(String name, ArrayList<PetitObjetBasique> objets) {
        this.name = name;
        this.objets = objets;
    }

    public void addObjet(PetitObjetBasique objet) {
        objets.add(objet);
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    public ArrayList<PetitObjetBasique> getObjets() {
        return objets;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bureau{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
