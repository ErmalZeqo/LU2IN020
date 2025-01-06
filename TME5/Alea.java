//Ermal Zeqo 21315866
//Question 36.1
public class Alea {
    
    private Alea() {
        
    }

    
    public static char lettre() {
        return (char) ('a' + (int) (Math.random() * 26));
    }

    
    public static String chaine() {
        StringBuilder resultat = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            resultat.append(lettre());
        }
        return resultat.toString();
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        System.out.println(chaine());
    }
}

/*
Question 23.2
Ces méthodes sont des méthodes de classe (c'est-à-dire des méthodes static) parce qu'elles n'ont pas besoin de se référer à une instance spécifique de la classe Alea. 
Elles utilisent uniquement des données locales et des valeurs générées aléatoirement, ce qui signifie que leur comportement ne dépend pas des attributs d'un objet particulier.

Question 23.3

Pour interdire la création d'instances de la classe Alea, on utilis un constructeur privé. En rendant le constructeur privé, on empêche toute classe externe de créer une instance de Alea.
Cela garantit que la classe ne puisse être utilisée que comme une boîte à outils.

*/
