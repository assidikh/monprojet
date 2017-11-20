package Nos_Fichiers;


// La classe Représentant//
class Representant extends Commercial {
private final static double POURCENT_REPRESENTANT = 0.2;
private final static int BONUS_REPRESENTANT = 200;
public Representant(String prenom, String nom, int age, String date, String matricule,double chiffreAffaire) {
super(prenom, nom, age, date, matricule, chiffreAffaire);
}
public double calculerSalaire() {
return (POURCENT_REPRESENTANT * getChiffreAffaire()) + BONUS_REPRESENTANT;
}
public String getTitre()
{
return "Le représentant ";
}
}