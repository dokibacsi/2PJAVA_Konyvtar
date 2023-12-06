package model;
public class KolcsonozhetoGumikacsa extends AbstractTermek implements Kolcsonozheto {
   
    
    private boolean kolcsonozheto;

    public KolcsonozhetoGumikacsa(String nev, double ar) {
        super(nev, ar);
        this.kolcsonozheto = true;
    }


    @Override
    public boolean isKolcsonozheto() {
        return this.kolcsonozheto;
    }
}
