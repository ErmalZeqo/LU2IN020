// Ermal Zeqo No.Etudiant 21315866
//Question 19.3
public class TestTracteur {
    public static void main(String[] args) {
        
        Roue grandeRoue1 = new Roue(120);
        Roue grandeRoue2 = new Roue(120);

        
        Roue petiteRoue1 = new Roue();
        Roue petiteRoue2 = new Roue();

        
        System.out.println(grandeRoue1);
        System.out.println(grandeRoue2);
        System.out.println(petiteRoue1);
        System.out.println(petiteRoue2);
        
/*Output 
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME3$ javac TestTracteur.java Roue.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME3$ java TestTracteur.java
Roue de 120 cm
Roue de 120 cm
Roue de 60 cm
Roue de 60 cm
*/
        
        
//Question 19.5
        Cabine cabine = new Cabine(3, "bleue");

        // Affichage de la cabine
        System.out.println(cabine);
        
//Output: Cabine de 3.0 m3, Couleur: bleue
 


//Question 19.7
        Tracteur t1 = new Tracteur(cabine, grandeRoue1, grandeRoue2, petiteRoue1, petiteRoue2);

        // Affichage du tracteur
        System.out.println(t1);
   
/* Output:
Tracteur avec cabine Cabine de 3.0 m3, Couleur: bleue et roues: [Roue de 120 cm, Roue de 120 cm, Roue de 60 cm, Roue de 60 cm]
*/


/*Question 19.8
Si on faites Tracteur t2 = t1, cela ne crée pas une copie indépendante de t1, mais une référence au même objet en mémoire. Ainsi, changer la couleur de la cabine via t2 affectera également t1.

Pour créer une copie indépendante, on doit implémenter une technique de "copie profonde" , où on copies les objets imbriqués (comme la cabine et les roues) plutôt que simplement copier les références.
*/


    }
}
