//Ermal Zeqo 21315866
//Question 42.3
public class Voiture extends AMoteur {
    private int nbPlaces;

    public Voiture(String marque, double capaciteReservoir, int nbPlaces) {
        super(marque, capaciteReservoir);
        this.nbPlaces = nbPlaces;
    }

   
    public String toString() {
        return "Voiture " + super.toString() + " avec " + nbPlaces + " places";
    }

    public void transporter(int nbPers, int km) {
        if (enPanne()) {
            System.out.println("La voiture " + id + " n’a plus d’essence !");
        } else {
            System.out.println("La voiture " + id + " transporte " + nbPers + " personnes sur " + km + " km");
        }
    }
}

