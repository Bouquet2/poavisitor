package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public class VisiteurSuffixe implements Visiteur {

    @Override
    public void visit(Univers o) {
        for (Piece p : o.getPieces()) {
            p.accept(this);
        }
        System.out.println(o.toString());
    }

    @Override
    public void visit(Piece o) {
        for (ObjetBasique ob : o.getObjetsBasiques()) {
            ob.accept(this);
        }
        System.out.println(o.toString());
    }

    @Override
    public void visit(Bureau o) {
        for (PetitObjetBasique po : o.getObjets()) {
            po.accept(this);
        }
        System.out.println(o.toString());
    }

    @Override
    public void visit(GardeRobe o) {
        for (Vetement v : o.getVetements()) {
            v.accept(this);
        }
        System.out.println(o.toString());
    }

    @Override
    public void visit(Vetement o) {
        System.out.println(o.toString());
    }

    @Override
    public void visit(Lit o) {
        System.out.println(o.toString());
    }

    @Override
    public void visit(CollectionLivres o) {
        for (Livre l : o.getLivres()) {
            l.accept(this);
        }
        System.out.println(o.toString());
    }

    @Override
    public void visit(Lampe o) {
        System.out.println(o.toString());
    }

    @Override
    public void visit(Livre o) {
        System.out.println(o.toString());
    }

    @Override
    public void visit(Porte o) {
        System.out.println(o.toString());
    }

    @Override
    public void visit(Tiroir o) {
        System.out.println(o.toString());
    }
}
