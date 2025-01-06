//Ermal Zeqo 21315866
//Question 35.3

public class TestCone {
    public static void main(String[] args) {
       
        System.out.println("Nombre de cônes créés : " + Cone.getNbCones());

        
        Cone cone1 = new Cone(5.4, 7.2);
        Cone cone2 = new Cone();

        
        System.out.println(cone1);
        System.out.println(cone2);

        
        System.out.println("Nombre de cônes créés : " + Cone.getNbCones());
    }
}

/*Outpout:
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ javac Cone.java TestCone.java
21315866@ppti-14-308-15:/users/nfs/Etu6/21315866/Bureau/LU2IN002/TME5$ java TestCone
Nombre de cônes créés : 0
Cone r=5,4cm h=7,2cm de volume 219,9cm3
Cone r=1,4cm h=6,0cm de volume 11,8cm3
Nombre de cônes créés : 2

*/



