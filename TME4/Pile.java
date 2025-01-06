//Ermal Zeqo 21315866
//Question 28.2
class Pile {
    private Assiette[] tableau;
    private int nbA; 

    // Constructeur avec taille maximale de la pile
    public Pile(int tailleMax) {
        tableau = new Assiette[tailleMax];
        nbA = 0; // Au départ, la pile est vide
    }

    // Vérifie si la pile est vide
    public boolean estVide() {
        return nbA == 0;
    }

    // Vérifie si la pile est pleine
    public boolean estPleine() {
        return nbA == tableau.length;
    }

    // Ajoute une assiette au sommet de la pile
    public void empiler(Assiette a) {
        if (!estPleine()) {
            tableau[nbA] = a;
            nbA++;
        }
    }

    // Retire l'assiette du sommet de la pile et la retourne
    public Assiette depiler() {
        if (!estVide()) {
            nbA--;
            Assiette a = tableau[nbA];
            tableau[nbA] = null; 
            return a;
        }
        return null;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = nbA - 1; i >= 0; i--) {
            sb.append(tableau[i]).append("\n");
        }
        return sb.toString();
    }
}
