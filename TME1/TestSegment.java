//Ermal Zeqo No.Etudiant 21315866
//Exercice 6 – Segment de droite
//Question 6.1

//Question 2
public class TestSegment {
    public static void main(String[] args) {
        Segment segment1 = new Segment(6, 8);
        Segment segment2 = new Segment(12, 5);

        int longueur1 = segment1.longueur();
        int longueur2 = segment2.longueur();

        if (longueur1 > longueur2) {
            System.out.println("Le premier segment est plus long.");
        } else {
            System.out.println("Le deuxième segment est plus long.");
        }
    }
}
/*
Les commends:
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ javac TestSegment.java Segment.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ java TestSegment
Le deuxième segment est plus long.
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ 

*/
