// Ermal Zeqo No.Etudiant 21315866
//Question 13.2
public class TestAdresseWeb {
    public static void main(String[] args) {
        // Création des adresses web en utilisant différents constructeurs
        AdresseWeb adresse1 = new AdresseWeb("https", "site1.com", "/page1.html");
        AdresseWeb adresse2 = new AdresseWeb("site2.com", "/page2.html");
        AdresseWeb adresse3 = new AdresseWeb("site3.com");

        // Affichage des URLs correspondantes
        System.out.println(adresse1.toString());  
        System.out.println(adresse2.toString());  
        System.out.println(adresse3.toString());  
    }
}

/* Output
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ javac TestAdresseWeb.java AdresseWeb.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME2$ java TestAdresseWeb
https://www.site1.com/page1.html
http://www.site2.com/page2.html
http://www.site3.com
*/
