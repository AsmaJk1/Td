class Produit {
    private String id;
    private String libelle;
    private double prix;

    
    public Produit(String id, String libelle, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    
    public String getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

  
    public boolean comparer(Produit p) {
        return this.id.equals(p.getId()) && this.libelle.equals(p.getLibelle()) && this.prix == p.getPrix();
    }

    
    public static boolean comparer(Produit p1, Produit p2) {
        return p1.getId().equals(p2.getId()) && p1.getLibelle().equals(p2.getLibelle()) && p1.getPrix() == p2.getPrix();
    }
}
