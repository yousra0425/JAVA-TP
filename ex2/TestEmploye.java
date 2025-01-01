package ex2;

import java.util.Scanner;

public class TestEmploye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le matricule: ");
        String matricule = scanner.nextLine();

        System.out.print("Entrez le nom: ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom: ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez l'année de naissance: ");
        int anneeNaissance = scanner.nextInt();

        System.out.print("Entrez l'année d'embauche: ");
        int anneeEmbauche = scanner.nextInt();

        System.out.print("Entrez le salaire: ");
        double salaire = scanner.nextDouble();

        Employe employe = new Employe(matricule, nom, prenom, anneeNaissance, anneeEmbauche, salaire);

        System.out.println("\nInformations de l'employé avant augmentation:");
        employe.afficherEmploye();

        employe.augmentationDuSalaire();

        System.out.println("\nInformations de l'employé après augmentation:");
        employe.afficherEmploye();

        scanner.close();
    }
}
