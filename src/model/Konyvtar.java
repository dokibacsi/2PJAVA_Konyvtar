package model;

import java.util.ArrayList;
import java.util.List;

public class Konyvtar {

    NemKolcsonozhetoAuto auto;
    KolcsonozhetoGumikacsa gumikacsa;
    AbstractTermek termek;
    private List<AbstractTermek> termekek = new ArrayList<>();

    private void run() {
        felvesz("Tisza", 3000);
        termekek();
    }

    private void felvesz(String nev, int ar) {
        List<AbstractTermek> felvettTermek = new ArrayList<>();
        for (AbstractTermek termek : termekek) {
            if (termek.getNev().equals("Gumikacsa")) {
                felvettTermek.add(new KolcsonozhetoGumikacsa(nev, ar));
            } else if (termek.getNev().equals("Auto")) {
                felvettTermek.add(new NemKolcsonozhetoAuto(nev, ar));
            }
        termekek.addAll(felvettTermek);
        }
    }

    private void termekek() {
        for (int i = 0; i < 10; i++) {
            System.out.println(termekek);
        }
        
    }

    private void kolcsonoz(Kolcsonozheto kolcsonoz) {
        if (kolcsonoz.isKolcsonozheto()) {
            System.out.println("A tárgy kölcsönözhető.");
        } else {
            System.out.println("A tárgy nem kölcsönözhető.");
        }
    }

}
