package ex2;

class Bouton extends Rectangle {
    private String text;

    public Bouton() {
        super();
        this.text = "";
    }

    public Bouton(int x, int y, double largeur, double hauteur, String text) {
        super(x, y, largeur, hauteur);
        this.text = text;
    }

    public Bouton(Bouton other) {
        super(other);
        this.text = other.text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void affiche() {
        System.out.println("Bouton [x=" + x + ", y=" + y + ", largeur=" + getLargeur() + ", hauteur=" + getHauteur() + ", text=" + text + "]");
    }
}
