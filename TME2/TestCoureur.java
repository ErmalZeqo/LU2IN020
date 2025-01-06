// Ermal Zeqo No.Etudiant 21315866
//Question 14.3
public class TestCoureur {
    public static void main(String[] args) {
        // Création des 4 coureurs
        Coureur c1 = new Coureur(101);
        Coureur c2 = new Coureur(202);
        Coureur c3 = new Coureur(303);
        Coureur c4 = new Coureur(404);

        // Le premier coureur a le témoin au départ
        c1.setPossedeTemoin(true);

        // Afficher les caractéristiques des coureurs
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // Question 14.6:  Simuler la course de relais 400m
        c1.courir();
        c1.passeTemoin(c2);

        c2.courir();
        c2.passeTemoin(c3);

        c3.courir();
        c3.passeTemoin(c4);

        c4.courir();
        c4.setPossedeTemoin(false);  // Le dernier coureur n'a plus le témoin après la course

        // Calculer et afficher le temps total
        double tempsTotal = c1.getTempsAu100() + c2.getTempsAu100() + c3.getTempsAu100() + c4.getTempsAu100();
        System.out.printf("Temps total pour 400m : %.2f secondes\n", tempsTotal);
    }
}



/*21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ javac TestAdresseWeb.java AdresseWeb.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ java TestAdresseWeb
https://www.site1.com/page1.html
http://www.site2.com/page2.html
http://www.site3.com
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ ls
AdresseWeb.class  Coureur.java		TestAdresseWeb.java
AdresseWeb.java   TestAdresseWeb.class	TestCoureur.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ javac TestCoureur.java Coureur.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ java TestCoureur
Coureur 101 tempsAu100 : 13,20s au 100m possedeTemoin : oui
Coureur 202 tempsAu100 : 14,84s au 100m possedeTemoin : non
Coureur 303 tempsAu100 : 15,00s au 100m possedeTemoin : non
Coureur 404 tempsAu100 : 12,30s au 100m possedeTemoin : non
Je suis le coureur 101 et je cours.
Moi, coureur 101, je passe le témoin au coureur 202
Je suis le coureur 202 et je cours.
Moi, coureur 202, je passe le témoin au coureur 303
Je suis le coureur 303 et je cours.
Moi, coureur 303, je passe le témoin au coureur 404
Je suis le coureur 404 et je cours.
Temps total pour 400m : 55,33 secondes
*/
