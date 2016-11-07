package fr.paris10.poa.td5.main;

import fr.paris10.poa.td5.visiteur.*;

import java.util.ArrayList;

/**
 * Created by vabouque on 07/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Bureau b = new Bureau("Bureau1");

        Vetement v = new Vetement("Chemise");
        Vetement v2 = new Vetement("T-shirt");
        Vetement v3 = new Vetement("Pantalon");
        GardeRobe gb = new GardeRobe("Ma garde robe");
        gb.addObjet(v);
        gb.addObjet(v2);
        gb.addObjet(v3);

        Livre l = new Livre("1984");
        Livre l2 = new Livre("Dune");
        Livre l3 = new Livre("Le cycle des robots");
        CollectionLivres cl = new CollectionLivres("Science-fiction");
        cl.addObjet(l);
        cl.addObjet(l2);
        cl.addObjet(l3);

        Lampe lamp = new Lampe("Lampe ovale");
        Lampe lamp2 = new Lampe("Lampe Ronde");
        Lit lit = new Lit("Lit pouilleux");

        Piece p = new Piece("Chambre");
        p.addObjet(lamp);
        p.addObjet(lit);
        p.addObjet(gb);
        Piece p2 = new Piece("Salon");
        b.addObjet(cl);
        p2.addObjet(b);
        p2.addObjet(lamp2);

        Univers u = new Univers("Mon univers");

        u.addObjet(p);
        u.addObjet(p2);


        /*
        Visiteur
         */
        VisiteurComptage visiteur = new VisiteurComptage();
        u.accept(visiteur);
        System.out.println("Visiteur compte : " + VisiteurComptage.getCompte());
        Visiteur visiteur2 = new VisiteurPrefixe();
        u.accept(visiteur2);


    }



}
