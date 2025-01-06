////Ermal Zeqo No.Etudiant 21315866
//Question 8.1
public class TestLettre {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            Lettre lettre = new Lettre(c);
            System.out.println("Le code ASCII de '" + c + "' est " + lettre.getCodeAscii());
        }
//Question 8.2
   	for (char c = 'a'; c <= 'z'; c++) {
            Lettre lettre = new Lettre(c);
            System.out.print(lettre.getCarac() + " ");
            if ((c - 'a'+1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
