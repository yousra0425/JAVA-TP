package ex1;

public class Etudiant extends Personne{
    private String diplomeEnCours;
    private static int nbrEtudiants = 0;

    public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours){
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplomeEnCours;
        nbrEtudiants++;
    }

    @Override
    public void ecrirePersonne(){
        System.out.println("Étudiant : " + toString() + ", Diplôme en cours: " + diplomeEnCours);
    }
    
    public static int nbrEtudiants() {
        return nbrEtudiants;
    }
}
