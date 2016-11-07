package fr.paris10.poa.td5.visiteur;

import java.util.ArrayList;

/**
 * Created by vabouque on 07/11/2016.
 */
public class Piece {
    private String name;
    private ArrayList<ObjetBasique> objetsBasiques;

    public Piece(String name) {
        this.name = name;
        this.objetsBasiques = new ArrayList<>();
    }

    public Piece(String name, ArrayList<ObjetBasique> objetsBatique) {
        this.name = name;
        this.objetsBasiques = objetsBatique;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    public void addObjet(ObjetBasique objet) {
        this.objetsBasiques.add(objet);
    }

    public ArrayList<ObjetBasique> getObjetsBasiques() {
        return objetsBasiques;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Piece{");
        sb.append('}');
        return sb.toString();
    }
}
