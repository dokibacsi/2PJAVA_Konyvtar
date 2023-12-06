package model;

import java.util.ArrayList;
import java.util.List;

public class Konyvtar {
    
    
    List<AbstractTermek> termekek = new ArrayList<>();
     
    private void run(){
        felvesz();
	kolcsonoz();
	termekek();
    }

    private void felvesz(){
        if(termekek.getNev().equals("Gumikacsa")){
            termekek.add(new KolcsonozhetoGumikacsa());
        }
        else if(termekek.getNev().equals("Auto")){
            termekek.add(new NemKolcsonozhetoAuto());
        }
    }

    private void termekek() {
       
    }

    private void kolcsonoz(Kolcsonozheto kolcsonoz) {
        if(kolcsonoz.isKolcsonozheto()){
            System.out.println("sss");
        }
        else{
            System.out.println("aaa");
        }
    }
        
        
        
}
