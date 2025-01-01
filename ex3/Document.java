package ex3;

public class Document {
    protected int numeroEnregistrement;
    protected String titre;

    public Document(int numeroEnregistrement, String titre) {
        this.numeroEnregistrement = numeroEnregistrement;
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document [Numéro: " + numeroEnregistrement + ", Titre: " + titre + "]";
    }
}
