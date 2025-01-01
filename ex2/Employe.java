package ex2;


class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int anneeNaissance;
    private int anneeEmbauche;
    private double salaire;

    public Employe(String matricule, String nom, String prenom, int anneeNaissance, int anneeEmbauche, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.anneeEmbauche = anneeEmbauche;
        this.salaire = salaire;
    }

    // Getters and Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public int getAnneeEmbauche() {
        return anneeEmbauche;
    }

    public void setAnneeEmbauche(int anneeEmbauche) {
        this.anneeEmbauche = anneeEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    
    public int getAnciennete() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - anneeEmbauche;
    }

    public int getAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - anneeNaissance;
    }

    public void augmentationDuSalaire() {
        int anciennete = getAnciennete();
        if (anciennete < 5) {
            salaire += salaire * 0.02;
        } else if (anciennete < 10) {
            salaire += salaire * 0.05;
        } else {
            salaire += salaire * 0.10;
        }
    }

    public void afficherEmploye() {
        System.out.println("Matricule: " + matricule);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Année de naissance: " + anneeNaissance);
        System.out.println("Année d'embauche: " + anneeEmbauche);
        System.out.println("Salaire: " + salaire);
        System.out.println("Ancienneté: " + getAnciennete() + " ans");
        System.out.println("Âge: " + getAge() + " ans");
    }
}

