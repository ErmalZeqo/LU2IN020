//Ermal Zeqo 21315866
public class Cone {
    //Question 35.1
    private double r; // Rayon du cône
    private double h; // Hauteur du cône

    
    private static final double PI = 3.14159; // Constante PI
    private static int nbCones = 0; // Nombre de cônes créés

    //Question 35.2
    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
        nbCones++; 
    }

    // Constructeur sans paramètres
    public Cone() {
        this(Math.random() * 10, Math.random() * 10); 
    }

    
    public double getVolume() {
        return (1.0 / 3) * PI * r * r * h; // Formule : 1/3 * π * r² * h
    }

   
    public String toString() {
        return String.format("Cone r=%.1fcm h=%.1fcm de volume %.1fcm3", r, h, getVolume());
    }

    
    public static int getNbCones() {
        return nbCones;
    }
}

