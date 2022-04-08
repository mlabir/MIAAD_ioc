package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {

    public static void main(String[] args) {

        /*
            Injection des dépendances par instanciation statique => new(couplage fort)
         */

        //DaoImpl dao = new DaoImpl();
        DaoImpl2 dao = new DaoImpl2();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(dao); //pour faire l'injection des dépendance
        System.out.println("resultat = "+metier.calcul());
    }
}
