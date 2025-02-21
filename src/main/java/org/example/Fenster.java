package org.example;

public class Fenster {

    private boolean offen;
    private Raum raum;                                                      // "raum1" wurde un "raum" umbenannt


    public Fenster(Raum raum) {
        this.raum = raum;
        this.offen = false;
    }

    public void oeffneFenster() {
        this.offen = true;
        raum.regeleTemperatur();
    }

    public void schliesseFenster() {
        this.offen = false;
        raum.regeleTemperatur();
    }

    public boolean istOffen() {
        return this.offen;
    }

    public Raum getRaum() {
        return this.raum;
    }

}

/*
Ein Raum kann mehrere Fenster haben, daher die Implementierung der List.
Ein Fenster kann immer nur einem Raum zugeordnet sein, daher die "einfache" Variable namens "raum".
 */
