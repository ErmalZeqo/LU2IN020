//Ermal Zeqo 21315866
//Question 37.3
import java.util.Random;

public class Projet {
    private String nomProjet;
    private Trio trio;

    
    public Projet(String nomProjet) {
        this.nomProjet = nomProjet;
        this.trio = new Trio();
    }
    // Question 37.5
    public Projet() {
        this.nomProjet = Alea.chaine();  // Utilisation de la méthode chaine() de la classe Alea
        this.trio = new Trio();
    }

    // Question 37.6
    public String toString() {
        return "Projet " + nomProjet + " " + trio;
    }
}



