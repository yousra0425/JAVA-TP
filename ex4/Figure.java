package ex4;

import java.util.Vector;


class Figure {
    protected int abscisse;
    protected int ordonnee;
    protected int couleur;
    private static Vector<Figure> instances = new Vector<>();

    public Figure(int abscisse, int ordonnee, int couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
        instances.add(this); 
    }

    public static Vector<Figure> getInstances() {
        return instances;
    }

    @Override
    public String toString() {
        return "Figure [Abscisse: " + abscisse + ", Ordonnée: " + ordonnee + ", Couleur: " + couleur + "]";
    }
}