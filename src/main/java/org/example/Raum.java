package org.example;

import java.util.ArrayList;

public class Raum {

    private final int raumId;
    private int zieltemperatur;

    private final ArrayList<Fenster> fensterListe = new ArrayList<>();
    private final ArrayList<Heizung> heizungsListe = new ArrayList<>();

    private Thermometer thermometer;                            // "thermometer1" wurde in "thermometer" umbenannt


    public Raum(int raumId, int zieltemperatur) {
        this.raumId = raumId;
        this.zieltemperatur = zieltemperatur;
    }

    public boolean hatOffeneFenster() {

        boolean istOffen = false;

        for( int i = 0; i < fensterListe.size(); i++) {

            if(fensterListe.get(i).istOffen() == true) {
                istOffen = true;
                break;
            }
        }

        return istOffen;

    }

    public void regeleTemperatur() {

        int aktuelleTemperatur = thermometer.getTemperatur();
        if (hatOffeneFenster()) {
            schalteHeizungenAus();
        } else {
            if (zieltemperatur > aktuelleTemperatur) {
                schalteHeizungenAus();
            } else {
                schalteHeizungenEin();
            }
        }
    }

    private void schalteHeizungenEin() {
        for(int j = 0; j < heizungsListe.size(); j++) {
            heizungsListe.get(j).schalteEin();
        }
    }

    private void schalteHeizungenAus() {
        for(int i = 0; i < heizungsListe.size(); i++) {
            heizungsListe.get(i).schalteAus();
        }
    }

    public ArrayList<Fenster> getFensterListe() {
        return fensterListe;
    }

    public ArrayList<Heizung> getHeizungsListe() {
        return heizungsListe;
    }

    public Thermometer getThermometer() {
        return thermometer;
    }

    public int getZieltemperatut() {
        return this.zieltemperatur;
    }

    public void setZieltemperatur(int zieltemperatur) {
        this.zieltemperatur = zieltemperatur;
    }

    public String toString() {
        return "Raum " + raumId + ": " + zieltemperatur + ". " + "Fenster: " + getFensterListe().size() + ". " + "Heizungen: " + getHeizungsListe().size() + ".";
    }


}
