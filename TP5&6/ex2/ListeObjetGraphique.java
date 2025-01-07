package ex2;

public class ListeObjetGraphique {
    private ObjetGraphique[] liste; 
    private int taille; 
    private int index;   

    public ListeObjetGraphique(int taille) {
        this.taille = taille;
        this.liste = new ObjetGraphique[taille];
        this.index = 0; 
    }

    public void ajouter(ObjetGraphique objet) {
        if (index < taille) {
            liste[index] = objet;
            index++;
        } else {
            System.out.println("La liste est pleine, impossible d'ajouter l'objet.");
        }
    }

    public void afficheObjetsGraphique() {
        for (int i = 0; i < index; i++) {
            liste[i].affiche();
        }
    }
}
