package ex2;

public class TestObjetGraphique {
    public static void main(String[] args) {
        ObjetGraphique[] objets = new ObjetGraphique[3];

        objets[0] = new Rectangle(10, 20, 30, 40);
        objets[1] = new Bouton(15, 25, 50, 60, "OK");
        objets[2] = new Cercle(5, 10, 15);

        for (ObjetGraphique obj : objets) {
            obj.affiche();
        }
    }
}
