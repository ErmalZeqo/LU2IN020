//Ermal Zeqo 21315866
//Question 37.1.1 & 37.1.3
public class Personne {
    private String nom;
    private static int nbPersonnes = 0;
    private static char lettre = 'A';

    // Constructeur sans paramètre
    public Personne() {
        nbPersonnes++;
        this.nom = "Individu" + lettre++;
    }

   
    public static int getNbPersonnes() {
        return nbPersonnes;
    }

   // Question 37.6
    public String toString() {
        return nom;
    }
}

