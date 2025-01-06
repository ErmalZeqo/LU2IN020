//Ermal Zeqo 21315866
//Question 41.3
public class Guitare extends Instrument {
    private String type;

    public Guitare(int poids, int prix, String t) {
        super(poids, prix);
        type = t;
    }


    public String toString() {
        return "Guitare " + type + " " + super.toString();
    }

    public void jouer() {
        System.out.println("La guitare " + type + " joue.");
    }
}
