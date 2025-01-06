//Ermal Zeqo 21315866
import java.util.Random;
// Question 27.1
public class VectN {
    // Variable d'instance pour le tableau d'entiers
    private int[] tab;

    // Question 27.2 Constructeur privé 
    private VectN(int n) {
        tab = new int[n];
    }

    // Constructeur qui initialise un tableau de taille n avec des valeurs aléatoires entre 0 et valMax
    public VectN(int n, int valMax) {
        this(n); // Appel au constructeur privé pour réserver la mémoire
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(valMax + 1); // Valeurs entre 0 et valMax inclus
        }
    }

    // Constructeur sans paramètre
    public VectN() {
        this(5, 9); // Appel au constructeur précédent avec taille 5 et valMax 9
    }

    // Constructeur avec trois paramètres pour initialiser un vecteur [a, b, c]
    public VectN(int a, int b, int c) {
        tab = new int[3];
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
    }

    // Question 27.3 Méthode qui calcule la somme des éléments du vecteur
    public int somme() {
        int sum = 0;
        for (int val : tab) {
            sum = sum+ val;
        }
        return sum;
    }
    
    // Question 27.4 a 
    public int[] getTab() {
        return tab; 
    }

    // Question 27.3 
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tab.length; i++) {
            sb.append(tab[i]);
            if (i < tab.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

  
    public static void main(String[] args) {
        // Test du constructeur avec n et valMax
        VectN vect1 = new VectN(5, 10);
        System.out.println("Vecteur 1 : " + vect1);
        System.out.println("Somme des éléments : " + vect1.somme());

        // Test du constructeur sans paramètre
        VectN vect2 = new VectN();
        System.out.println("Vecteur 2 : " + vect2);
        System.out.println("Somme des éléments : " + vect2.somme());

        // Test du constructeur avec trois paramètres
        VectN vect3 = new VectN(1, 2, 3);
        System.out.println("Vecteur 3 : " + vect3);
        System.out.println("Somme des éléments : " + vect3.somme());
        
        
        VectN vect = new VectN(4, 5, 6);
        int[] t = vect.getTab();
        System.out.println("Avant modification : vect = " + vect);
        t[0] = 100; 
        System.out.println("Après modification : vect = " + vect);
    }
    
}

/* Question 27.4 b
D’après l’affichage obtenu, pensez-vous que c’est une bonne idée d’écrire une méthode qui
retourne une variable d’instance de type tableau ? Proposer une solution, puis re-tester le code ci-après pour vérifier que la variable d’instance n’est plus modifiée.

Pour éviter cela, on peut retourner une copie du tableau dans l'accesseur getTab().
public int[] getTab() {
        return tab.clone(); // Retourne une copie du tableau
    }
    
En retournant une copie du tableau avec tab.clone(), toute modification du tableau retourné n'a aucun impact sur l'objet interne. 

*/

