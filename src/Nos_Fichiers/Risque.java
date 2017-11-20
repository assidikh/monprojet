package Nos_Fichiers;


// interface  Risque//

interface Risque {
int PRIME = 25000;
}

// sous-classe  Risque//

class TechnRisque extends Technicien implements Risque {
public TechnRisque(String prenom, String nom, int age, String date,String matricule, int unites) {
super(prenom, nom, age, date,matricule, unites);
}
public double calculerSalaire() {
return super.calculerSalaire() + PRIME;
}
}

// Une autre sous-classe d'employé à risque//

class ManutRisque extends Manutention implements Risque {
public ManutRisque(String prenom, String nom, int age, String date,String matricule, int heures) {
super(prenom, nom, age, date,matricule, heures);
}
public double calculerSalaire() {
return super.calculerSalaire() + PRIME;
}
}
