package ex3;

import java.util.ArrayList;
import java.util.List;

public class ListeDeDocuments {
    private List<Document> documents = new ArrayList<>();

    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    public void tousLesAuteurs() {
        for (Document doc : documents) {
            if (doc instanceof Livre) {
                System.out.println("Auteur: " + ((Livre) doc).getAuteur());
            }
        }
    }

    public void tousLesDocuments() {
        for (Document doc : documents) {
            System.out.println(doc.toString());
        }
    }
}
