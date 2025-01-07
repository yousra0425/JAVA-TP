package ex2;

public class TestListeObjetGraphique {
    public static void main(String[] args) {
        ListeObjetGraphique listeObjets = new ListeObjetGraphique(10);

        listeObjets.ajouter(new Cercle(1, 2, 5.0));
        listeObjets.ajouter(new Rectangle(2, 4, 6.0, 8.0));
        listeObjets.ajouter(new Bouton(10, 20, 100.0, 50.0, "Cliquez ici"));
        listeObjets.ajouter(new Cercle(3, 5, 7.0));
        listeObjets.ajouter(new Rectangle(4, 6, 9.0, 4.0));

        listeObjets.afficheObjetsGraphique();
    }
}
