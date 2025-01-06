//Ermal Zeqo 21315866
//Question 42.8
public class Camion extends AMoteur {
    private double volumeTransporte;

    public Camion(String marque, double capaciteReservoir, double volumeTransporte) {
        super(marque, capaciteReservoir);
        this.volumeTransporte = volumeTransporte;
    }

    
    public String toString() {
        return "Camion " + super.toString() + " avec un volume transporté de " + volumeTransporte + " m³";
    }

    public void transporter(String materiau, int km) {
        if (enPanne()) {
            System.out.println("Le camion " + id + " n’a plus d’essence !");
        } else {
            System.out.println("Le camion " + id + " a transporté " + materiau + " sur " + km + " km");
        }
    }
}

