package fr.paris10.poa.td5.visiteur;

/**
 * Created by vabouque on 07/11/2016.
 */
public interface PetitObjetBasique extends ObjetBasique {

    @Override
    void accept(Visiteur v);
}
