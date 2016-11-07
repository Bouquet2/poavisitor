package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public class VisiteurPrefixe implements Visiteur {

    //TODO visit
    @Override
    public void visit(Univers o) {
        o.toString();
        for (Piece p : o.getPieces()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(Piece o) {
        o.toString();
        for (ObjetBasique ob : o.getObjetsBasiques()) {
            ob.accept(this);
        }
    }

    @Override
    public void visit(Bureau o) {
        o.toString();
        for (PetitObjetBasique po : o.getObjets()) {
            po.accept(this);
        }
    }

    @Override
    public void visit(GardeRobe o) {
        o.toString();
        for (Vetement v : o.getVetements()) {
            v.accept(this);
        }
    }

    @Override
    public void visit(Vetement o) {
        o.toString();
    }

    @Override
    public void visit(Lit o) {
        o.toString();
    }

    @Override
    public void visit(CollectionLivres o) {
        o.toString();
        for (Livre l : o.getLivres()) {
            l.accept(this);
        }
    }

    @Override
    public void visit(Lampe o) {
        o.toString();
    }

    @Override
    public void visit(Livre o) {
        o.toString();
    }

    @Override
    public void visit(Porte o) {
        o.toString();
    }

    @Override
    public void visit(Tiroir o) {
        o.toString();
    }


}
