package fr.paris10.poa.td5.visiteur;

import java.util.ArrayList;

/**
 * Created by vabouque on 07/11/2016.
 */
public class CollectionLivres implements PetitObjetBasique{
    private String name;
    private ArrayList<Livre> livres;

    public CollectionLivres(String name) {
        this.name = name;
        this.livres = new ArrayList<>();
    }

    public CollectionLivres(String name, ArrayList<Livre> livres) {
        this.name = name;
        this.livres = livres;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    public void test() {
        return ;
    }
    public void addObjet(Livre livre) {
        livres.add(livre);
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void setLivres(ArrayList<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CollectionLivres{");
        sb.append("name='").append(name).append('\'');
        sb.append(", livres=").append(livres);
        sb.append('}');
        return sb.toString();
    }
}
