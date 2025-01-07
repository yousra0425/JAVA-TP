package ex1;

public class Secretaire extends Personne {
    private String numeroBureau;
    private static int nbrSecretaires = 0;

    public Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
        super(nom, prenom, rue, ville);
        this.numeroBureau = numeroBureau;
        nbrSecretaires++;
    }

    @Override
    public void ecrirePersonne() {
        System.out.println("Secrétaire : " + toString() + ", Bureau: " + numeroBureau);
    }

    public static int nbrSecretaires() {
        return nbrSecretaires;
    }
}
