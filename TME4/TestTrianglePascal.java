//Ermal Zeqo 21315866
//Question 29.2
public class TestTrianglePascal {
    public static void main(String[] args) {
        
        TrianglePascal triangle6 = new TrianglePascal(6);
        triangle6.remplirTriangle();
        System.out.println("Triangle de Pascal avec 6 lignes :");
        System.out.println(triangle6.toString());

        
        TrianglePascal triangle7 = new TrianglePascal(7);
        triangle7.remplirTriangle();
        System.out.println("Triangle de Pascal avec 7 lignes :");
        System.out.println(triangle7.toString());

        
        TrianglePascal triangle0 = new TrianglePascal(0);
        triangle0.remplirTriangle();
        System.out.println("Triangle de Pascal avec 0 lignes :");
        System.out.println(triangle0.toString());
    }
}
