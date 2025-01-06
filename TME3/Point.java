// Ermal Zeqo No.Etudiant 21315866
//Question 20.1
import java.util.Random;

public class Point {
    private int posx;
    private int posy;

    
    public Point(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    // Constructeur sans paramètres (valeurs aléatoires entre 0 et 9)
    public Point() {
        Random rand = new Random();
        this.posx = rand.nextInt(10);
        this.posy = rand.nextInt(10);
    }

    public String toString() {
        return "(" + posx + ", " + posy + ")";
    }

    
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.posx - this.posx, 2) + Math.pow(p.posy - this.posy, 2));
    }

    
    public void deplaceToi(int newx, int newy) {
        this.posx = newx;
        this.posy = newy;
    }

   
    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

   //Question 20.5
    public Point copy() {
        return new Point(this.posx, this.posy);
    }
}

