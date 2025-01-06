//Ermal Zeqo No.Etudiant 21315866
//Exercice 7 – Solidarité villageoise
//Question 7.3: Ajouter une méthode main dans la classe TestVillageois
public class TestVillageois {
    public static void main(String[] args) {
        Villageois villageois1 = new Villageois("Eustache");
        Villageois villageois2 = new Villageois("Pierre");
        Villageois villageois3 = new Villageois("Marie");
        Villageois villageois4 = new Villageois("Jean");
//Question 7.4: Afficher la méthode toString de chacun des villageois
        System.out.println(villageois1.toString());
        System.out.println(villageois2.toString());
        System.out.println(villageois3.toString());
        System.out.println(villageois4.toString());
//Question 7.9: Ajouter les instructions pour calculer le poids total que peuvent soulever les 4 villageois
         double poidsTotalSouleve = villageois1.poidsSouleve() + villageois2.poidsSouleve() + villageois3.poidsSouleve() + villageois4.poidsSouleve();
         if (poidsTotalSouleve >= 100) {
            System.out.println("Les villageois réussissent à soulever le rocher !");
        } else {
            System.out.println("Les villageois ne réussissent pas à soulever le rocher.");
        }
    }
}
