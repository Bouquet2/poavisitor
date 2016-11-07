package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public class VisiteurComptage implements Visiteur {

    private static int compte = 0;

    @Override
    public void visit(Univers o) {
        compte++;
        for (Piece p : o.getPieces()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(Piece o) {
        compte++;
        for (ObjetBasique ob : o.getObjetsBasiques()) {
            ob.accept(this);
        }
    }

    @Override
    public void visit(Bureau o) {
        compte++;
        for (PetitObjetBasique po : o.getObjets()) {
            po.accept(this);
        }
    }

    @Override
    public void visit(GardeRobe o) {
        compte++;
        for (Vetement v : o.getVetements()) {
            v.accept(this);
        }
    }

    @Override
    public void visit(Vetement o) {
        compte++;
    }

    @Override
    public void visit(Lit o) {
        compte++;
    }

    @Override
    public void visit(CollectionLivres o) {
        compte++;
        for (Livre l : o.getLivres()) {
            l.accept(this);
        }
    }

    @Override
    public void visit(Lampe o) {
        compte++;
    }

    @Override
    public void visit(Livre o) {
        compte++;
    }

    @Override
    public void visit(Porte o) {
        compte++;
    }

    @Override
    public void visit(Tiroir o) {
        compte++;
    }

    public void resetVisit() {
        compte = 0;
    }

    public static int getCompte() {
        return compte;
    }
}
