//Ermal Zeqo 21315866
//Question 41.4
public class Orchestre {
    private Instrument[] instruments;
    private int nombreInstrumentsCourant;

    public Orchestre(int max) {
        instruments = new Instrument[max];
        nombreInstrumentsCourant = 0;
    }

    public void ajouterInstrument(Instrument x) {
        if (nombreInstrumentsCourant < instruments.length) {
            instruments[nombreInstrumentsCourant] = x;
            nombreInstrumentsCourant++;
        } else {
            System.out.println("L'orchestre est plein, impossible d'ajouter l'instrument.");
        }
    }

    public void jouer() {
        for (int i = 0; i < nombreInstrumentsCourant; i++) {
            instruments[i].jouer();
        }
    }
}

