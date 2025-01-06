// Ermal Zeqo No.Etudiant 21315866
//Question 19.4
public class Cabine {
    private double volume;
    private String couleur;

    // Constructeur avec paramètres
    public Cabine(double volume, String couleur) {
        this.volume = volume;
        this.couleur = couleur;
    }

    // Méthode toString()
    public String toString() {
        return "Cabine de " + volume + " m3, Couleur: " + couleur;
    }

 
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}

