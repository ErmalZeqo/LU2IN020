// Ermal Zeqo No.Etudiant 21315866
//Question 19.2
public class Roue {
    private int diametre;

    
    public Roue(int diametre) {
        this.diametre = diametre;
    }

    
    public Roue() {
        this(60);
    }

    
    public String toString() {
        return "Roue de " + diametre + " cm";
    }
}

