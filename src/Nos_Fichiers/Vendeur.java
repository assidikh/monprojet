package Nos_Fichiers;


class Vendeur extends Commercial {
private final static double POURCENT_VENDEUR = 0.2;
private final static int BONUS_VENDEUR = 100;
public Vendeur(String prenom, String nom, int age, String date,String matricule,
double chiffreAffaire) {
super(prenom, nom, age, date,matricule, chiffreAffaire);
}
public double calculerSalaire() {
return (POURCENT_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR;
}
public String getTitre()
{
return "Le vendeur ";
}
}