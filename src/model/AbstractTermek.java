package model;

import java.util.UUID;

public abstract class AbstractTermek {
    private UUID uuid; 

    private String nev;
    private double ar;

    public AbstractTermek(String nev, double ar) {
        this.uuid = UUID.randomUUID();
        this.nev = nev;
        this.ar = ar;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNev() {
        return nev;
    }

    public double getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "AbstractTermek{" +
                "uuid=" + uuid +
                ", nev='" + nev + '\'' +
                ", ar=" + ar +
                '}';
    }
}
