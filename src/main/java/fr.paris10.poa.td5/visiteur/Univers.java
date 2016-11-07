package fr.paris10.poa.td5.visiteur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vabouque on 07/11/2016.
 */
public abstract class Univers {
    private ArrayList<Piece> pieces;
    private String name;

    public Univers(ArrayList<Piece> pieces, String name) {
        this.pieces = pieces;
        this.name = name;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Univers{");
        sb.append("pieces=").append(pieces);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
