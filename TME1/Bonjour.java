// Ermal Zeqo No.Etudiant 21315866
/*
Exercice 5 
Questoin 5.1 :
class Bonjour {
    static void main(String[] args) {
        System.out.println("Bonjour !");
    }
}
Question 5.1.1:   javac Bonjour.java
Question 5.1.2:   java Bonjour            L'exécution du programme affichera le message "Bonjour !".
Si nous supprimons le fichier Bonjour.class et relançons la commande pour exécuter le programme, nous obtiendrons une erreur car le fichier Bonjour.class n'existe plus.
Les commends:
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ rm Bonjour.class
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ javac Bonjour.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ java Bonjour
Bonjour !

*/ 
//Question 5.2.1
/*21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ javac Bonjour.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME1$ java Bonjour
Erreur : la méthode principale est introuvable dans la classe Bonjour, définissez la méthode principale comme suit :
   public static void main(String[] args)
ou une classe d'applications JavaFX doit étendre javafx.application.Application
*/

//Question 5.2.2
public class Bonjour {
    public static void main(String[] args) {
        System.out.println("Bonjour !");
    }
}
/*Question 5.2.3
Si nous transformons la méthode main en Main, le code devient :
public class Bonjour {
    public static void Main(String[] args) {
        System.out.println("Bonjour !");
    }
}
La compilation réussira, mais nous ne pourrons pas exécuter le programme car la méthode main doit être nommée exactement "main" pour être reconnue par la JVM.*/ 

/*Question 5.2.4
Si nous supprimons l'accolade { qui suit le main, le code devient :
public class Bonjour {
    public static void main(String[] args)
        System.out.println("Bonjour !");
}
La compilation échouera avec un message d'erreur indiquant que l'erreur se trouve à la ligne 3.
*/

/*Question 5.2.5
Si nous supprimons le mot-clé public, le code devient :
class Bonjour {
    static void main(String[] args) {
        System.out.println("Bonjour !");
    }
}
La compilation réussira, mais nous ne pourrons pas exécuter le programme car la méthode main doit être déclarée comme publique pour être accessible depuis l'extérieur.
*/

/*Question 5.2.6
Si nous supprimons le mot-clé static, le code devient :

public class Bonjour {
    public void main(String[] args) {
        System.out.println("Bonjour !");
    }
}
La compilation réussira, mais nous ne pourrons pas exécuter le programme car la méthode main doit être déclarée comme statique pour être appelée par la JVM.
*/
