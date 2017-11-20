package Nos_Fichiers;


//La classe Manutention//

class Manutention extends Employe {
private final static double SALAIRE_HORAIRE = 65.0;
private int heures;
public Manutention(String prenom, String nom, int age, String date,String matricule,
int heures) {
super(prenom, nom, age, date,matricule);
this.heures = heures;
}
public double calculerSalaire() {
return SALAIRE_HORAIRE * heures;
}
public String getTitre()
{
return "Le manut. " ;
}
}