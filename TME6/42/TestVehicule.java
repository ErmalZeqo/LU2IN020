//Ermal Zeqo 21315866
//Question 42.5
public class TestVehicule {
    public static void main(String[] args) {
        Velo myVelo = new Velo("MyVTT", 17);
        Voiture myVoiture = new Voiture("MyCar", 50, 5);
        Camion myCamion = new Camion("MyTruck", 100, 30);

        //Question 42.9
        Vehicule[] parc = {myVelo, myVoiture, myCamion};

        for (Vehicule vehicule : parc) {
            vehicule.rouler(10);
        }
    }
}
/*
Question 42.10
La méthode transporter peut être factorisée au niveau de la classe Vehicule sous forme d'une méthode abstraite ou d'une méthode polymorphique, si nécessaire. Cependant, la signature et le comportement diffèrent selon le type de véhicule, donc une implémentation spécifique dans chaque classe fille reste justifiée.


Output
21315866@ppti-14-308-15:~/Bureau/LU2IN002/TME6/Ex.42$ javac Voiture.java Vehicule.java Velo.java Camion.java AMoteur.java SansMoteur.java TestVehicule.java
21315866@ppti-14-308-15:~/Bureau/LU2IN002/TME6/Ex.42$ java TestVehicule
Vélo 1 de marque MyVTT sans moteur 17 vitesses a roulé 10.0 km
Voiture 2 de marque MyCar à moteur avec 5 places a roulé 10.0 km
Camion 3 de marque MyTruck à moteur avec un volume transporté de 30.0 m³ a roulé 10.0 km
21315866@ppti-14-308-15:~/Bureau/LU2IN002/TME6/Ex.42$ 


*/
