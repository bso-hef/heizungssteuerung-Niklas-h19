package org.example;

import java.util.ArrayList;

public class Temperaturmanager {

    private ArrayList<Raum> raumliste = new ArrayList();


    public void regeleTemperatur() {

    }

    public void erstelleRaeume() {

        Raum raum1 = new Raum(01,20);
        Raum raum2 = new Raum(02,20);

        Fenster fenster1 = new Fenster(raum1);
        Fenster fenster2 = new Fenster(raum1);
        Fenster fenster3 = new Fenster(raum2);
        Fenster fenster4 = new Fenster(raum2);

        Heizung heizung1 = new Heizung(raum1);
        Heizung heizung2 = new Heizung(raum1);
        Heizung heizung3 = new Heizung(raum2);
        Heizung heizung4 = new Heizung(raum2);

        raumliste.add(raum1);
        raumliste.add(raum2);
    }
}
