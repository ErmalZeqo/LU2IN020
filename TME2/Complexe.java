// Ermal Zeqo No.Etudiant 21315866
//Question 15.1
import java.util.Random;
public class Complexe {
    private double reelle;
    private double imag;

    // Constructeur à 2 arguments
    public Complexe(double reelle, double imag) {
        this.reelle = reelle;
        this.imag = imag;
    }

    
    // Méthode pour générer un nombre aléatoire dans l'intervalle [-2, 2[
    private static double generateRandom() {
        return new Random().nextDouble() * 4 - 2;
    }

    // Constructeur sans argument, utilisant la méthode generateRandom()
    public Complexe() {
        this(generateRandom(), generateRandom());
    }
	//Question 15.2
    // Méthode toString()
    public String toString() {
        return "(" + reelle + " + " + imag + "i)";
    }

    // Méthode pour vérifier si le nombre complexe est réel
    public boolean estReel() {
        return imag == 0;
    }

    // Méthode pour l'addition de deux complexes
    public Complexe addition(Complexe autre) {
        return new Complexe(this.reelle + autre.reelle, this.imag + autre.imag);
    }

    // Méthode pour la multiplication de deux complexes
    public Complexe multiplication(Complexe autre) {
        double nouvelleReelle = this.reelle * autre.reelle - this.imag * autre.imag;
        double nouvelleImag = this.reelle * autre.imag + this.imag * autre.reelle;
        return new Complexe(nouvelleReelle, nouvelleImag);
    }
}

