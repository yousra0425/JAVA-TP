package ex4;

import java.util.Vector;

public class Rectangle extends Figure {
    private int longueur;
    private int largeur;

    public Rectangle(int abscisse, int ordonnee, int couleur, int longueur, int largeur) {
        super(abscisse, ordonnee, couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public static Vector<Figure> getInstances() {
        Vector<Figure> rectangleInstances = new Vector<>();
        for (Figure f : Figure.getInstances()) {
            if (f instanceof Rectangle) {
                rectangleInstances.add(f);
            }
        }
        return rectangleInstances;
    }

    @Override
    public String toString() {
        return "Rectangle [Abscisse: " + abscisse + ", Ordonnée: " + ordonnee + ", Couleur: " + couleur +
               ", Longueur: " + longueur + ", Largeur: " + largeur + "]";
    }
}
