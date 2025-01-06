//Ermal Zeqo No.Etudiant 21315866
//Exercice 7 – Solidarité villageoise
//Question 7.1
public class Villageois {
    private String nom;
    private double poids;
    private boolean malade;
//Question 7.2
    public Villageois(String nomVillageois) {

        nom = nomVillageois;
        poids = Math.random() * (150 - 50) + 50; // poids compris entre 50 et 150 kg (150 exclu)
        malade = Math.random() < 0.2; // 20% des cas où le villageois est malade
        }
//Question 7.6: Ajouter les accesseurs dans la classe Villageois
    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public boolean getMalade() {
        return malade;
    }
//Question 7.7: Ajouter la méthode poidsSouleve dans la classe Villageois
   public double poidsSouleve() {
        if (malade) {
            return poids / 4;
        } else {
            return poids / 3;
        }

    }


//Question 7.5:Ajouter la méthode toString dans la classe Villageois
//Question 7.8:Modifier la méthode toString pour qu’elle retourne en plus le poids soulevé
    public String toString() {
        String etatMalade = malade ? "oui" : "non";
        return String.format("villageois : %s, poids : %.2f kg, malade : %s, peut soulever %.2f kg", nom, poids, etatMalade, poidsSouleve());

    }
 
}

