//Ermal Zeqo 21315866
//Question 37.2
public class Trio {
    private Personne[] personnes;
    private static int compteurTrio = 0;
    private int numero;

    
    public Trio() {
        personnes = new Personne[3];
        for (int i = 0; i < 3; i++) {
            personnes[i] = new Personne();
        }
        compteurTrio++;
        this.numero = compteurTrio;
    }

    
    public String toString() {
        return "Trio " + numero + " : " + personnes[0] + " " + personnes[1] + " " + personnes[2];
    }
}

