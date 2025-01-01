package ex3;

public class Dictionnaire extends Document {
    private String langue;
    private int nombreDeTomes;

    public Dictionnaire(int numeroEnregistrement, String titre, String langue, int nombreDeTomes) {
        super(numeroEnregistrement, titre);
        this.langue = langue;
        this.nombreDeTomes = nombreDeTomes;
    }

    @Override
    public String toString() {
        return "Dictionnaire [Numéro: " + numeroEnregistrement + ", Titre: " + titre +
               ", Langue: " + langue + ", Tomes: " + nombreDeTomes + "]";
    }
}
