package org.example;

public class Heizung {

    private boolean eingeschaltet;
    private Raum raum;                                                      // "raum1" wurde in "raum" umbenannt

    public Heizung(Raum raum) {
        this.raum = raum;
    }

    public void schalteEin() {
        this.eingeschaltet = true;
    }

    public void schalteAus() {
        this.eingeschaltet = false;
    }

    public boolean istEingeschaltet() {
        return this.eingeschaltet;
    }

    public Raum getRaum() {
        return this.raum;
    }

}
