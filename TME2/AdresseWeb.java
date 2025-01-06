// Ermal Zeqo No.Etudiant 21315866
//Question 13.1
public class AdresseWeb {
    private String protocole;
    private String domaine;
    private String chemin;

    // Premier constructeur : 3 paramètres
    public AdresseWeb(String protocole, String domaine, String chemin) {
        this.protocole = protocole;
        this.domaine = domaine;
        this.chemin = chemin;
    }

    // Deuxième constructeur : 2 paramètres, protocole = "http"
    public AdresseWeb(String domaine, String chemin) {
        this("http", domaine, chemin);  // Appel du constructeur à 3 paramètres
    }

    // Troisième constructeur : 1 paramètre, protocole = "http", chemin = ""
    public AdresseWeb(String domaine) {
        this("http", domaine, "");  // Appel du constructeur à 3 paramètres
    }

    // Méthode toString() pour générer l'URL
    public String toString() {
        return protocole + "://www." + domaine + chemin;
    }
}

