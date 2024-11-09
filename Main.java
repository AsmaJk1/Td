public class Main {
    public static void main(String[] args) {
        
        Produit p1 = new Produit("p1", "Pomme", 3.5);
        Produit p2 = new Produit("p2", "Banane", 2.0);
        Produit p3 = new Produit("p1", "Pomme", 3.5);
        
      
        System.out.println(p1.comparer(p3)); 
        System.out.println(p1.comparer(p2)); 
        
        
        System.out.println(Produit.comparer(p1, p3)); 
        System.out.println(Produit.comparer(p1, p2)); 
    }
}
