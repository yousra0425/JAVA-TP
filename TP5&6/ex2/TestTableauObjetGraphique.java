package ex2;

public class TestTableauObjetGraphique {
    public static void main(String[] args) {
        ObjetGraphique[] objets = new ObjetGraphique[5];

        objets[0] = new Cercle(5, 10, 7.0);
        objets[1] = new Rectangle(2, 4, 5.0, 3.0);
        objets[2] = new Bouton(1, 2, 100.0, 50.0, "Cliquez ici");
        objets[3] = new Cercle(8, 6, 10.0);
        objets[4] = new Rectangle(3, 3, 8.0, 6.0);

        for (ObjetGraphique objet : objets) {
            objet.affiche();
        }
    }
}
