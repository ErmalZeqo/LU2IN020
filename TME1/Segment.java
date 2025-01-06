//Ermal Zeqo No.Etudiant 21315866
//Exercice 6 – Segment de droite
//Question 6.1
public class Segment {
    private int x;
    private int y;

    public Segment(int extX, int extY) {
        x = extX;
        y = extY;
    }

    public int longueur() {
        if (x < y) {
            return y - x;
        } else {
            return x - y;
        }
    }

    public String toString() {
        return "Segment [" + x + "," + y + "]";
    }
}
