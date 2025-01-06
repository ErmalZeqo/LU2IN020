// Ermal Zeqo No.Etudiant 21315866
public class TestTriangle {
    public static void main(String[] args) {
        //Question 20.2
        Point p1 = new Point(3, 5);
        Point p2 = new Point(7, 1);
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Distance entre p1 et p2: " + p1.distance(p2));

        // Question 20.4
        Point p3 = new Point(2, 8);
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println("Triangle t1: " + t1);
        System.out.println("Périmètre de t1: " + t1.getPerimetre());

        // Question 20.6
        Triangle t1Copy = new Triangle(t1);
        System.out.println("Copie de t1: " + t1Copy);


        // Déplacement du premier point et vérification des modifications
        p1.deplaceToi(9, 9);
        System.out.println("Après déplacement du premier point de t1:");
        System.out.println("Triangle t1: " + t1);
        System.out.println("Copie de t1 (inchangée): " + t1Copy);
    }
}
/*   Output: 

21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME3$ java TestTriangle.java
Point 1: (3, 5)
Point 2: (7, 1)
Distance entre p1 et p2: 5.656854249492381
Triangle t1: {(3, 5); (7, 1); (2, 8)}
Périmètre de t1: 17.421457176703385
Copie de t1: {(3, 5); (7, 1); (2, 8)}
Après déplacement du premier point de t1:
Triangle t1: {(9, 9); (7, 1); (2, 8)}
Copie de t1 (inchangée): {(3, 5); (7, 1); (2, 8)}

*/

/*
  Question 20.7
   La méthode equals a été ajoutée dans la classe Triangle pour tester l'égalité structurelle en comparant les coordonnées des sommets des triangles.  
*/



