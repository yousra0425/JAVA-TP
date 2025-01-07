package ex3;


interface VendableKilo {
    double vendre(double quantite);
}

interface VendablePiece {
    double vendre(int quantite);
}

interface Solde {
    void lanceSolde(double pourcentage);
    void termineSolde(double pourcentage);
}

// Abstract class Article
abstract class Article {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(String nom, String fournisseur, double prixAchat, double prixVente) {
        this.nom = nom;
        this.fournisseur = fournisseur;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    public double rendement() {
        return ((prixVente - prixAchat) / prixAchat) * 100;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Fournisseur: " + fournisseur + ", Prix Achat: " + prixAchat + ", Prix Vente: " + prixVente + ", Rendement: " + rendement() + "%";
    }
}

// ArticleElectromenager class
class ArticleElectromenager extends Article implements VendablePiece, Solde {
    private int stock;

    public ArticleElectromenager(String nom, String fournisseur, double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
        this.stock = 0;
    }

    public void remplirStock(int quantite) {
        stock += quantite;
    }

    @Override
    public double vendre(int quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant pour " + nom);
            return 0;
        }
        stock -= quantite;
        return quantite * prixVente;
    }

    @Override
    public void lanceSolde(double pourcentage) {
        prixVente -= prixVente * (pourcentage / 100);
    }

    @Override
    public void termineSolde(double pourcentage) {
        prixVente += prixVente * (pourcentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}

// ArticlePrimeur class
class ArticlePrimeur extends Article implements VendableKilo {
    private double stock;

    public ArticlePrimeur(String nom, String fournisseur, double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
        this.stock = 0;
    }

    public void remplirStock(double quantite) {
        stock += quantite;
    }

    @Override
    public double vendre(double quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant pour " + nom);
            return 0;
        }
        stock -= quantite;
        return quantite * prixVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}

// Magasin class
class Magasin {
    private double depense;
    private double revenu;
    private ArticleElectromenager[] electromenagers;
    private ArticlePrimeur[] primeurs;

    public Magasin() {
        this.depense = 0;
        this.revenu = 0;
        this.electromenagers = new ArticleElectromenager[2];
        this.primeurs = new ArticlePrimeur[2];
    }

    public void ajouterElectromenager(ArticleElectromenager article, int index) {
        electromenagers[index] = article;
    }

    public void ajouterPrimeur(ArticlePrimeur article, int index) {
        primeurs[index] = article;
    }

    public double rendement() {
        return ((revenu - depense) / depense) * 100;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Magasin Details:\n");
        details.append("Depense: ").append(depense).append(", Revenu: ").append(revenu).append("\n");
        details.append("Articles Electromenagers:\n");
        for (ArticleElectromenager article : electromenagers) {
            if (article != null) details.append(article).append("\n");
        }
        details.append("Articles Primeurs:\n");
        for (ArticlePrimeur article : primeurs) {
            if (article != null) details.append(article).append("\n");
        }
        return details.toString();
    }

    public void enregistrerDepense(double montant) {
        depense += montant;
    }

    public void enregistrerRevenu(double montant) {
        revenu += montant;
    }
}
