public class TestOrchestre {
    public static void main(String[] args) {
        Guitare guitare = new Guitare(5, 500, "classique");
        Piano piano = new Piano(300, 700, 88);

        System.out.println(guitare);
        guitare.jouer();
        System.out.println(piano);
        piano.jouer();
        
        Orchestre orchestre = new Orchestre(5);
        orchestre.ajouterInstrument(guitare);
        orchestre.ajouterInstrument(piano);
        
        orchestre.jouer();
        
        
        
        
    }
}
/* 
Question 41.6
D'apres le cours utilisation de l'héritage permet d'ajouter de nouveaux instruments comme une trompette ou une batterie sans modifier les classes existantes.Donc il suffit de créer une nouvelle classe qui hérite d'Instrument et d'y ajouter ses spécificités.

Output
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME6/Ex.41$ javac Instrument.java Guitare.java Piano.java Orchestre.java TestOrchestre.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME6/Ex.41$ java TestOrchestre
Guitare classique poids : 5 kg, prix : 500 euros
La guitare classique joue.
Piano 88 touches et poids : 300 kg, prix : 700 euros
Le piano joue.
La guitare classique joue.
Le piano joue.

*/
