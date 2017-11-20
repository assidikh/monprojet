package Nos_Fichiers;


// La classe Commercial //
abstract class Commercial extends Employe {
private double chiffreAffaire;
public Commercial(String prenom, String nom, int age, String date,String matricule,
double chiffreAffaire) {
super(prenom, nom, age, date,matricule);
this.chiffreAffaire = chiffreAffaire;
}
public double getChiffreAffaire()
{
return chiffreAffaire;
}
}