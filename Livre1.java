public class Livre1 {
    private String titre;
    private String auteur;
    private double prix;

    // Getters and setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Livre1(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    // Method to display book details
    public void afficher() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix + "€");
    }

    // Main method for testing
    public static void main(String[] args) {
        Livre1 livre = new Livre1("It Ends with Us", "Coleen Hoover", 29.99);
        livre.afficher();
    }
}
