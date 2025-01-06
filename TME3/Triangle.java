// Ermal Zeqo No.Etudiant 21315866
//Question 20.3 
public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    // Constructeur avec trois points en paramètres
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Constructeur sans paramètres
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

   
    public String toString() {
        return "{" + p1.toString() + "; " + p2.toString() + "; " + p3.toString() + "}";
    }

    // Méthode pour calculer le périmètre du triangle
    public double getPerimetre() {
        double cote1 = p1.distance(p2);
        double cote2 = p2.distance(p3);
        double cote3 = p3.distance(p1);
        return cote1 + cote2 + cote3;
    }

    // Constructeur de copie
    public Triangle(Triangle t) {
        this.p1 = t.p1.copy();
        this.p2 = t.p2.copy();
        this.p3 = t.p3.copy();
    }

    // Méthode pour tester l'égalité structurelle
    public boolean equals(Triangle t) {
        return this.p1.distance(t.p1) == 0 &&
               this.p2.distance(t.p2) == 0 &&
               this.p3.distance(t.p3) == 0;
    }
}

