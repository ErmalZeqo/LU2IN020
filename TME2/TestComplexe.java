// Ermal Zeqo No.Etudiant 21315866
//Question 15.3
public class TestComplexe {
    public static void main(String[] args) {
        // Création de 3 complexes
        Complexe c1 = new Complexe(1, 1);
        Complexe c2 = new Complexe(2, 2);
        Complexe c3 = new Complexe(0, 0); // Réel, car imag = 0

        // Affichage des complexes
        System.out.println("Complexe 1 : " + c1);
        System.out.println("Complexe 2 : " + c2);
        System.out.println("Complexe 3 : " + c3);

        // Test si les complexes sont réels
        System.out.println("Complexe 1 est-il réel ? " + c1.estReel());
        System.out.println("Complexe 3 est-il réel ? " + c3.estReel());

        // Addition de c1 et c2
        Complexe somme = c1.addition(c2);
        System.out.println("Somme de c1 et c2 : " + somme);

        // Multiplication de c1 et c2
        Complexe produit = c1.multiplication(c2);
        System.out.println("Produit de c1 et c2 : " + produit);

        // Vérification de i^2 = -1
        Complexe i = new Complexe(0, 1);  // i = 0 + 1i
        Complexe iCarre = i.multiplication(i);
        System.out.println("i^2 = " + iCarre);  // Devrait afficher (-1 + 0i)
    }
}
/* Output:
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ javac TestComplexe.java Complexe.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ java TestComplexe
Complexe 1 : (1.0 + 1.0i)
Complexe 2 : (2.0 + 2.0i)
Complexe 3 : (0.0 + 0.0i)
Complexe 1 est-il réel ? false
Complexe 3 est-il réel ? true
Somme de c1 et c2 : (3.0 + 3.0i)
Produit de c1 et c2 : (0.0 + 4.0i)
i^2 = (-1.0 + 0.0i)
*/
