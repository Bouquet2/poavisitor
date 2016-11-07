package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public interface Visiteur {

    public void visit(Univers o);
    public void visit(Piece o);
    public void visit(Bureau o);
    public void visit(GardeRobe o);
    public void visit(Vetement o);
    public void visit(Lit o);
    public void visit(CollectionLivres o);
    public void visit(Lampe o);
    public void visit(Livre o);
    public void visit(Porte o);
    public void visit(Tiroir o);
}
