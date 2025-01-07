package ex1;

public class TestPersonne {
    public static void main(String[] args){
        Secretaire s = new Secretaire("Said", "Abidi", "Rue Elamal", "Casablanca", "A123");
        Enseignant e = new Enseignant("Ahmed", "Sbihi", "Rue Bel Air", "Fès", "Informatique");
        Etudiant e1 = new Etudiant("Samir", "Merras", "Rue Saules", "Oujda", "Licence Informatique");
        Etudiant e2 = new Etudiant("Hamid", "Nissani", "Rue d’Olivier", "Taza", "DUT Informatique");

        s.ecrirePersonne();
        e.ecrirePersonne();
        e1.ecrirePersonne();
        e2.ecrirePersonne();

        e.modifierPersonne("Rue du Grenadier", "Rabat");
        s.modifierPersonne("Rue Taounat", "Safi");

        e.ecrirePersonne();
        s.ecrirePersonne();

        System.out.println("Nombre de secrétaires : " + Secretaire.nbrSecretaires());
        System.out.println("Nombre d'enseignants : " + Enseignant.nbrEnseignants());
        System.out.println("Nombre d'étudiants : " + Etudiant.nbrEtudiants());
        Personne.nbPersonnes();
    
    
    }
}
