package ex3;

public class TestMagasin {
    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        ArticleElectromenager tv = new ArticleElectromenager("TV", "Samsung", 500, 800);
        ArticleElectromenager fridge = new ArticleElectromenager("Fridge", "LG", 700, 1200);
        ArticlePrimeur apples = new ArticlePrimeur("Apples", "Farmer Joe", 2, 4);
        ArticlePrimeur oranges = new ArticlePrimeur("Oranges", "Farmer Jane", 3, 5);

        magasin.ajouterElectromenager(tv, 0);
        magasin.ajouterElectromenager(fridge, 1);
        magasin.ajouterPrimeur(apples, 0);
        magasin.ajouterPrimeur(oranges, 1);

        tv.remplirStock(10);
        fridge.remplirStock(5);
        apples.remplirStock(50);
        oranges.remplirStock(30);

        magasin.enregistrerRevenu(tv.vendre(2));
        magasin.enregistrerRevenu(apples.vendre(10));

        System.out.println(magasin);
    }
}
