//Ermal Zeqo 21315866
//Question 42.3
public class Velo extends SansMoteur {
    private int nbVitesses;

    public Velo(String marque, int nbVitesses) {
        super(marque);
        this.nbVitesses = nbVitesses;
    }

   
    public String toString() {
        return "Vélo " + super.toString() + " " + nbVitesses + " vitesses";
    }

    public void transporter(String depart, String arrivee) {
        System.out.println("Le vélo " + id + " se déplace de " + depart + " à " + arrivee);
    }
}

