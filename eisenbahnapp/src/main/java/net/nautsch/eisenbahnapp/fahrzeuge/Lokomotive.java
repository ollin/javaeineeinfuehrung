package net.nautsch.eisenbahnapp.fahrzeuge;

/**
 * Ein spezielles Fahrzeug fuer Schienen.
 */
public class Lokomotive implements Fahrzeug {

    private static int anzahlLokomotiven;

    private String nummer;
    private int aktuelleGeschwindigkeit;

    public Lokomotive(String nummer) {
        this.nummer = nummer;
        anzahlLokomotiven++;
    }

    @Override
    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    public void beschleunigeAuf(int zielGeschwindigkeit) {
        this.aktuelleGeschwindigkeit = zielGeschwindigkeit;
    }

    public void anhalten() {
        this.aktuelleGeschwindigkeit = 0;
    }

    public static int getAnzahlLokomotiven() {
        return anzahlLokomotiven;
    }
}
