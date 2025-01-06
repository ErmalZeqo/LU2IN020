// Ermal Zeqo No.Etudiant 21315866
//Question 19.6
public class Tracteur {
    private Roue[] roues = new Roue[4];
    private Cabine cabine;

    
    public Tracteur(Cabine cabine, Roue roue1, Roue roue2, Roue roue3, Roue roue4) {
        this.cabine = cabine;
        this.roues[0] = roue1;
        this.roues[1] = roue2;
        this.roues[2] = roue3;
        this.roues[3] = roue4;
        
    }

   
    public String toString() {
        return "Tracteur avec cabine " + cabine + " et roues: [" + roues[0] + ", " + roues[1] + ", " + roues[2] + ", " + roues[3] + "]";
    }

    // Méthode pour changer la couleur de la cabine
    public void peindre(String couleur) {
        cabine.setCouleur(couleur);
    }
    
    public Tracteur clone(){
    	return new Tracteur(cabine.clone(),roues[0].clone(), roues[1].clone(), roues[2].clone(), roues[3].clone())
    }
   
}


