package ex4;

import java.util.Vector;

public class Carre extends Figure {
    private int cote;

    public Carre(int abscisse, int ordonnee, int couleur, int cote) {
        super(abscisse, ordonnee, couleur);
        this.cote = cote;
    }

    public static Vector<Figure> getInstances() {
        Vector<Figure> carreInstances = new Vector<>();
        for (Figure f : Figure.getInstances()) {
            if (f instanceof Carre) {
                carreInstances.add(f);
            }
        }
        return carreInstances;
    }

    @Override
    public String toString() {
        return "Carré [Abscisse: " + abscisse + ", Ordonnée: " + ordonnee + ", Couleur: " + couleur +
               ", Côté: " + cote + "]";
    }
}
