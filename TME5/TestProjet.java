//Ermal Zeqo 21315866
//Question 37.1.2
public class TestProjet {
    public static void main(String[] args) {
        
        System.out.println("nbPersonnes=" + Personne.getNbPersonnes());

        
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        System.out.println(p1);
        System.out.println(p2);

        
        System.out.println("nbPersonnes=" + Personne.getNbPersonnes());
        
        
        //Question 37.4
        Projet projet1 = new Projet("P3X-774");
        Projet projet2 = new Projet("P3R-233");
        System.out.println(projet1);
        System.out.println(projet2);

        // Question 37.6
        System.out.println("nbPersonnes=" + Personne.getNbPersonnes());
        
        
    }
}

/*Output:

21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ javac Personne.java Trio.java Projet.java TestProjet.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ java TestProjet
nbPersonnes=0
IndividuA
IndividuB
nbPersonnes=2
Projet P3X-774 Trio 1 : IndividuC IndividuD IndividuE
Projet P3R-233 Trio 2 : IndividuF IndividuG IndividuH
nbPersonnes=8

*/

