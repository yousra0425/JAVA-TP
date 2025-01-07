package ex2;

class Rectangle extends ObjetGraphique {
    private double largeur;
    private double hauteur;

    public Rectangle() {
        super();
        this.largeur = 0;
        this.hauteur = 0;
    }

    public Rectangle(int x, int y, double largeur, double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(Rectangle other) {
        super(other);
        this.largeur = other.largeur;
        this.hauteur = other.hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setTaille(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle [x=" + x + ", y=" + y + ", largeur=" + largeur + ", hauteur=" + hauteur + "]");
    }
}

