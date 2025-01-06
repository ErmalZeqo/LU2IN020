public class TestAlea {
    public static void main(String[] args) {
        
        System.out.println(Alea.chaine());

        // Tentative de création d'une instance de Alea 
       // Alea aleaInstance = new Alea(); // Cette ligne provoquerait une erreur de compilation
    }
}

/*

21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ javac Alea.java TestAlea.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ java TestAlea
lmhufwsffc



21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ javac Alea.java TestAlea.java
TestAlea.java:7: error: Alea() has private access in Alea
        Alea aleaInstance = new Alea(); // Cette ligne provoquerait une erreur de compilation
                            ^
1 error


*/


