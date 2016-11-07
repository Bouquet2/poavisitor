package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public interface Visiteur {

    void visit(Univers o);
    void visit(Piece o);
    void visit(Bureau o);
    void visit(GardeRobe o);
    void visit(Vetement o);
    void visit(Lit o);
    void visit(CollectionLivres o);
    void visit(Lampe o);
    void visit(Livre o);
    void visit(Porte o);
    void visit(Tiroir o);
}
