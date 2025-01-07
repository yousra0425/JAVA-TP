package ex1;

public class Enseignant extends Personne{
    private String specialite;
    private static int nbrEnseignants = 0;

    public Enseignant(String nom, String prenom, String vue, String ville, String specialite){
        super(nom, prenom, vue, ville);
        this.specialite = specialite ;
        nbrEnseignants++;
    }
    
    @Override
    public void ecrirePersonne(){
        System.out.println("Enseignant : " +toString() +", Spécialité: " + specialite);
    }

    public static int nbrEnseignants(){
        return nbrEnseignants;
    }
}