public class TestTableauMain {
    public static void main(String[] args) {
        
        System.out.println("Il y a " + args.length + " arguments");

        int i=0;
        for (String arg : args) {
            System.out.println("args["+i+"]= "+arg);
            i=i+1;
        }
        
    }
}

/* Output:
21315866@ppti-14-408-09:~/Bureau/LU2IN002$ javac TestTableauMain.java
21315866@ppti-14-408-09:~/Bureau/LU2IN002$ java TestTableauMain ab 123 cdef
Il y a 3 arguments
args[0]= ab
args[1]= 123
args[2]= cdef
*/

