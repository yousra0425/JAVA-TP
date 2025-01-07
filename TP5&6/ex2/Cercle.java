package ex2;

class Cercle extends ObjetGraphique {
    private double rayon;

    public Cercle() {
        super();
        this.rayon = 0;
    }

    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public Cercle(Cercle other) {
        super(other);
        this.rayon = other.rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle [x=" + x + ", y=" + y + ", rayon=" + rayon + "]");
    }
}