package ex3;

public class Livre extends Document {
    private String auteur;
    private int nombreDePages;

    public Livre(int numeroEnregistrement, String titre, String auteur, int nombreDePages) {
        super(numeroEnregistrement, titre);
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
    }

    @Override
    public String toString() {
        return "Livre [Numéro: " + numeroEnregistrement + ", Titre: " + titre +
               ", Auteur: " + auteur + ", Pages: " + nombreDePages + "]";
    }

    public String getAuteur() {
        return auteur;
    }
}
