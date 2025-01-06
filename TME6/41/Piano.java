//Ermal Zeqo 21315866
//Question 41.3
public class Piano extends Instrument {
    private int nombreDeTouches;

    public Piano(int poids, int prix, int ns) {
        super(poids, prix);
        nombreDeTouches = ns;
    }

    public String toString() {
        return "Piano " + nombreDeTouches + " touches et " + super.toString();
    }

    public void jouer() {
        System.out.println("Le piano joue.");
    }
}

