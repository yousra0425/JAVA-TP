package ex1;
public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String rue;
    protected String ville;
    private static int nbPersonnes = 0; 

    
    public Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes++;
    }

  
    public abstract void ecrirePersonne();

    public void modifierPersonne(String rue, String ville) {
        this.rue = rue;
        this.ville = ville;
        ecrirePersonne();
    }

    public static void nbPersonnes() {
        System.out.println("Nombre total de personnes : " + nbPersonnes);
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", Adresse: " + rue + ", " + ville;
    }
}
