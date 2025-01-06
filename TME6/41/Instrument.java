//Ermal Zeqo 21315866
//Question 41.2
public class Instrument {
    private int poids;
    private int prix;

    public Instrument(int poids, int prix) {
        this.poids = poids;
        this.prix = prix;
    }
    //Question 41.5
    public void jouer() {
        System.out.println("L'instrument joue.");
    }
    
    public String toString() {
        return "poids : " + poids + " kg, prix : " + prix + " euros";
    }
}


