public class TrianglePascal {
    private int[][] triangle; // Tableau triangulaire pour stocker les coefficients

    // Constructeur qui alloue la mémoire pour un triangle de Pascal avec n lignes
    public TrianglePascal(int n) {
        triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1]; // Chaque ligne a i+1 éléments
        }
    }

    // Méthode pour remplir le triangle avec les valeurs des coefficients binomiaux
    public void remplirTriangle() {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1; // Les bords du triangle contiennent 1
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
    }

    // Méthode pour afficher le triangle de Pascal sous forme de chaîne
    @Override
public String toString() {
    String sb = ""; // Chaîne pour stocker le résultat final
    
    for (int i = 0; i < triangle.length; i++) {
        // Ajouter des espaces pour centrer chaque ligne
        
        // Ajouter les valeurs de la ligne actuelle
        for (int j = 0; j < triangle[i].length; j++) {
            sb += triangle[i][j] ; // Ajoute chaque valeur suivie d'un espace
        }
        for (int space = 0; space < triangle.length - i - 1; space++) {
            sb += " "; // Ajoute des espaces pour le centrage
        }

        

        sb += "\n"; // Retour à la ligne après chaque ligne du triangle
    }
    
    return sb;
}

}

