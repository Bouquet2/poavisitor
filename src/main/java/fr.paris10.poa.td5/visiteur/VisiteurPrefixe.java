package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public class VisiteurPrefixe implements Visiteur {

    //TODO visit
    @Override
    public void visit(Univers o) {
        System.out.println(o.toString());
        for (Piece p : o.getPieces()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(Piece o) {
        System.out.println(o.toString());
        for (ObjetBasique ob : o.getObjetsBasiques()) {
            ob.accept(this);
        }
    }

    @Override
    public void visit(Bureau o) {
        System.out.println(o.toString());
        for (PetitObjetBasique po : o.getObjets()) {
            po.accept(this);
        }
    }

    @Override
    public void visit(GardeRobe o) {
        System.out.println(o.toString());
        for (Vetement v : o.getVetements()) {
            v.accept(this);
        }
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
        System.out.println(o.toString());
        for (Livre l : o.getLivres()) {
            l.accept(this);
        }
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
