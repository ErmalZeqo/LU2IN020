// Ermal Zeqo No.Etudiant 21315866
//Question 14.1

//Une jam ketu.
import java.util.Random;

public class Coureur {
    private int numDossard;
    private double tempsAu100;
    private boolean possedeTemoin;

    // Constructeur avec un paramètre (numéro de dossard)
    public Coureur(int numDossard) {
        this.numDossard = numDossard;
        this.tempsAu100 = genererTempsAleatoire(12, 16);  // Temps aléatoire entre 12 et 16 secondes
        this.possedeTemoin = false;  // Le coureur n'a pas le témoin par défaut
    }

    //Question 14.2:   Constructeur sans paramètre
    public Coureur() {
        this(genererDossardAleatoire());  // Appel du constructeur avec numéro de dossard aléatoire
    }

    // Méthode pour générer un numéro de dossard aléatoire (entre 1 et 1000)
    private static int genererDossardAleatoire() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;  // Génère un entier entre 1 et 1000
    }

    // Méthode pour générer un temps aléatoire entre min (inclus) et max (exclus)
    private static double genererTempsAleatoire(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble();  // Génère un nombre dans [min, max[
    }

    // Question 14.4
    public int getNumDossard() {
        return numDossard;
    }

    public double getTempsAu100() {
        return tempsAu100;
    }

    public boolean getPossedeTemoin() {
        return possedeTemoin;
    }

    // Setter (mutateur)
    public void setPossedeTemoin(boolean possedeTemoin) {
        this.possedeTemoin = possedeTemoin;
    }

    // Méthode toString() pour décrire le coureur
    public String toString() {
        return String.format("Coureur %d tempsAu100 : %.2fs au 100m possedeTemoin : %s",
                numDossard, tempsAu100, (possedeTemoin ? "oui" : "non"));
    }

    // Question 14.5:   Méthode passeTemoin pour passer le témoin à un autre coureur
    public void passeTemoin(Coureur c) {
        if (this.possedeTemoin) {
            System.out.println("Moi, coureur " + this.numDossard + ", je passe le témoin au coureur " + c.getNumDossard());
            this.possedeTemoin = false;
            c.setPossedeTemoin(true);
        } else {
            System.out.println("Le coureur " + this.numDossard + " n'a pas de témoin à passer.");
        }
    }

    // Méthode courir pour simuler la course
    public void courir() {
        System.out.println("Je suis le coureur " + this.numDossard + " et je cours.");
    }
}


