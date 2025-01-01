package ex3;

public class Bibliotheque {
    public static void main(String[] args) {
        ListeDeDocuments listeDeDocuments = new ListeDeDocuments();

        listeDeDocuments.ajouterDocument(new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupéry", 96));
        listeDeDocuments.ajouterDocument(new Dictionnaire(2, "Larousse", "Français", 2));
        listeDeDocuments.ajouterDocument(new Livre(3, "1984", "George Orwell", 328));

        System.out.println("Liste des auteurs :");
        listeDeDocuments.tousLesAuteurs();

        System.out.println("\nListe des documents :");
        listeDeDocuments.tousLesDocuments();
    }
}
