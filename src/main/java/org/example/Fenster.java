package org.example;

public class Fenster {

    private boolean offen;
    private Raum raum;                                                      // "raum1" wurde un "raum" umbenannt


    public Fenster(Raum raum) {
        this.raum = raum;
    }

    public void oeffneFenster() {
        this.offen = true;
    }

    public void schliesseFenster() {
        this.offen = false;
    }

    public boolean istOffen() {
        return this.offen;
    }

    public Raum getRaum() {
        return this.raum;
    }

}
