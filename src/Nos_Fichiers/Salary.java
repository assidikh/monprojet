
package Nos_Fichiers;


public class Salary {
    public static void main(String[] args) {
        Personnel p = new Personnel();
p.ajouterEmploye(new Vendeur("Aliou", "Boubakar", 49, "1995","163A", 30000));
p.ajouterEmploye(new Representant("Fidel", "André", 32, "2001","693A", 20000));
p.ajouterEmploye(new Technicien("Hassan", "Ousmanou", 26, "1998","169B", 1000));
p.ajouterEmploye(new Manutention("Pierre", "Franklain", 38, "1998","073B", 45));
p.ajouterEmploye(new TechnRisque("Nono", "Flippe", 24, "2000","103A", 1000));
p.ajouterEmploye(new ManutRisque("Almeyda", "Black", 29, "2001","100C", 45));
p.afficherSalaires();
System.out.println("Le salaire moyen dans l'entreprise est de "
+ p.salaireMoyen() + " francs.");
    }
    
}
