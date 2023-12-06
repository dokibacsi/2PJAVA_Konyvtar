package model;

public class NemKolcsonozhetoAuto extends AbstractTermek implements Kolcsonozheto {
     private boolean kolcsonozheto;
    public NemKolcsonozhetoAuto(String nev, double ar) {
        super(nev, ar);
        this.kolcsonozheto = false;
    }

    @Override
    public boolean isKolcsonozheto() {
        return this.kolcsonozheto;
    }
}
