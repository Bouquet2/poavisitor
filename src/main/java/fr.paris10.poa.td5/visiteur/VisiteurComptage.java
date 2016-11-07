package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public class VisiteurComptage implements Visiteur {

    private static int compte = 0;

    @Override
    public void visit(Univers o) {
        compte++;
    }

    @Override
    public void visit(Piece o) {
        compte++;
    }

    @Override
    public void visit(Bureau o) {
        compte++;
    }

    @Override
    public void visit(GardeRobe o) {
        compte++;
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

    public double compte() {
        return this.compte;
    }
}
