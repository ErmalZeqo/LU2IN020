// Ermal Zeqo No.Etudiant 21315866
//Question 21.4

public class TestPersonne {
    public static void main(String[] args) {
        // Création de trois célibataires
        Personne p1 = new Personne("Personi A");
        Personne p2 = new Personne("Personi B");
        Personne p3 = new Personne();

        // Affichage initial des trois personnes
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Mariage de p1 avec p2
        p1.epouser(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Tentative de mariage de p1 avec p3 (impossible)
        p1.epouser(p3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Tentative de mariage de p3 avec p1 (impossible)
        p3.epouser(p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Tentative de mariage de p3 avec lui-même (impossible)
        p3.epouser(p3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Divorce de p1
        p1.divorcer();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Tentative de divorce de p3 (impossible car p3 est célibataire)
        p3.divorcer();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}


/*OUTPUT

21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME3$ javac TestPersonne.java Personne.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME3$ java TestPersonne.java
Personi A, célibataire
Personi B, célibataire
Pers Q, célibataire
Personi A, célibataire se marie avec Personi B, célibataire.
Personi A, marié(e) à Personi B
Personi B, marié(e) à Personi A
Pers Q, célibataire
Le mariage de Personi A, marié(e) avec Pers Q, célibataire est impossible.
Personi A, marié(e) à Personi B
Personi B, marié(e) à Personi A
Pers Q, célibataire
Le mariage de Pers Q, célibataire avec Personi A, marié(e) est impossible.
Personi A, marié(e) à Personi B
Personi B, marié(e) à Personi A
Pers Q, célibataire
Le mariage de Pers Q, célibataire avec Pers Q, célibataire est impossible.
Personi A, marié(e) à Personi B
Personi B, marié(e) à Personi A
Pers Q, célibataire
Personi A, marié(e) divorce de Personi B, marié(e).
Personi A, célibataire
Personi B, célibataire
Pers Q, célibataire
Pers Q est célibataire, le divorce est impossible.
Personi A, célibataire
Personi B, célibataire
Pers Q, célibataire

*/

