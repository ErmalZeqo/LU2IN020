//Ermal Zeqo 21315866
//Question 28.3
public class TestPile {
    public static void main(String[] args) {
        Pile pile = new Pile(3); // Création d'une pile pouvant contenir au maximum 3 assiettes

        // Empiler trois assiettes
        pile.empiler(new Assiette(20));
        pile.empiler(new Assiette(25));
        pile.empiler(new Assiette(30));

        System.out.println("Contenu après empilement de trois assiettes :");
        System.out.println(pile);

        // Dépiler une fois
        pile.depiler();

        System.out.println("Contenu après avoir dépiler une fois :");
        System.out.println(pile);

        // Empiler deux autres assiettes (la pile sera pleine)
        pile.empiler(new Assiette(35));
        pile.empiler(new Assiette(40));

        System.out.println("Contenu après avoir empilé deux autres assiettes (pile pleine) :");
        System.out.println(pile);

        // Dépiler 4 fois (la pile sera vide)
        pile.depiler();
        pile.depiler();
        pile.depiler();
        pile.depiler();

        System.out.println("Contenu après avoir dépiler quatre fois (pile vide) :");
        System.out.println(pile);
    }
}
