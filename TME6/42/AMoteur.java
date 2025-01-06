//Ermal Zeqo 21315866
//Question 42.2
public class AMoteur extends Vehicule {
    protected double capaciteReservoir;
    protected double niveauEssence;

    public AMoteur(String marque, double cR) {
        super(marque);
        capaciteReservoir = cR;
        niveauEssence = 0;
    }
    //Question 42.6
    public void approvisionner(double nbLitres) {
	niveauEssence = Math.min(this.niveauEssence + nbLitres, capaciteReservoir);
    }

    public boolean enPanne() {
    return niveauEssence <= 0;
    }

   
    public String toString() {
        return super.toString() + " à moteur";
    }
}
