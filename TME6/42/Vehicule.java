//Ermal Zeqo 21315866
//Question 42.2

public class Vehicule {
    private static int compteur = 0;
    protected final int id;
    protected String marque;
    protected double distanceParcourue;

    public Vehicule(String marque) {
        this.id = ++compteur;
        this.marque = marque;
        this.distanceParcourue = 0;
    }

    
    public String toString() {
        return id + " de marque " + marque;
    }
    //Question 42.4
    public void rouler(double distance) {
    this.distanceParcourue += distance;
    System.out.println(this.toString() + " a roulé " + distance + " km");
}

}



