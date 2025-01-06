// Ermal Zeqo No.Etudiant 21315866
//Question 21.1

import java.util.Random;

public class Personne {
    private String nom;
    private Personne conjoint;

    public Personne(String nom) {
        this.nom = nom;
        this.conjoint = null; // Au départ, la personne est célibataire
    }

    
    public Personne() {
        Random rand = new Random();
        char lettreAleatoire = (char) ('A' + rand.nextInt(26)); 
        this.nom = "Pers " + lettreAleatoire;
        this.conjoint = null;
    }

    // Afficher l'état marital de la personne
    public String toString() {
        if (conjoint == null) {
            return nom + ", célibataire";
        } else {
            return nom + ", marié(e) à " + conjoint.nom;
        }
    }

//Question 21.2
    public void epouser(Personne p) {
        if (this.conjoint != null || p == null || p.conjoint != null || this == p) {
            System.out.println("Le mariage de " + this.nom + ", " + (this.conjoint == null ? "célibataire" : "marié(e)")
                    + " avec " + (p == null ? "null" : p.nom + ", " + (p.conjoint == null ? "célibataire" : "marié(e)"))
                    + " est impossible.");
        } else {
            this.conjoint = p;
            p.conjoint = this;
            System.out.println(this.nom + ", célibataire se marie avec " + p.nom + ", célibataire.");
        }
    }

//Question 21.3
    public void divorcer() {
        if (this.conjoint == null) {
            System.out.println(this.nom + " est célibataire, le divorce est impossible.");
        } else {
            System.out.println(this.nom + ", marié(e) divorce de " + this.conjoint.nom + ", marié(e).");
            this.conjoint.conjoint = null;
            this.conjoint = null;
        }
    }
}

