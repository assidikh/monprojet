package Nos_Fichiers;

 public abstract class Employe {
private String nom;
private String prenom;
private String matricule;
private int age;
private String date;
public Employe(String prenom, String nom, int age, String date,String matricule) {
this.nom = nom;
this.prenom = prenom;
this.age = age;
this.date = date;
this.matricule=matricule;
}
public abstract double calculerSalaire();
public String getTitre()
{
return "L'employé " ;
}
public String getNom() {
return getTitre() + prenom + " " + nom;
}
}