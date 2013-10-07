package net.nautsch.eisenbahnapp;

import net.nautsch.eisenbahnapp.fahrzeuge.Fahrzeug;
import net.nautsch.eisenbahnapp.fahrzeuge.Lokomotive;

public class EisenbahnApp {
    public static void main(String args[]) {
        final Lokomotive lok14251 = new Lokomotive("Ce 6/8 II - 14251");
        lok14251.beschleunigeAuf(30);

        druckeAktuelleGeschwindigkeit(lok14251);

        System.out.println(
            "Anzahl Lokomotiven      : " +
            Lokomotive.getAnzahlLokomotiven()
        );
    }

    private static void druckeAktuelleGeschwindigkeit(Fahrzeug fahrzeug) {
        System.out.println(
            "Aktuelle Geschwindigkeit: " +
            fahrzeug.getAktuelleGeschwindigkeit() +
            " km/h");
    }
}
