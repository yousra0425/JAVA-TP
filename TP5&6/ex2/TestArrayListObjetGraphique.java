package ex2;

import java.util.ArrayList;

public class TestArrayListObjetGraphique {
    public static void main(String[] args) {
        ArrayList<ObjetGraphique> objetsList = new ArrayList<>();

        objetsList.add(new Cercle(1, 2, 5.0));
        objetsList.add(new Rectangle(2, 4, 6.0, 8.0));
        objetsList.add(new Bouton(10, 20, 100.0, 50.0, "Cliquez ici"));
        objetsList.add(new Cercle(3, 5, 7.0));
        objetsList.add(new Rectangle(4, 6, 9.0, 4.0));

        for (ObjetGraphique objet : objetsList) {
            objet.affiche();
        }
    }
}
