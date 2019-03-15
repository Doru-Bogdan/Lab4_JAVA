package com;

public class User {

    private final String nume;

    private final String prenume;

    private final long ID;

    private final String[] numePrieteni;

    public User(String nume, String prenume, long ID, String[] numePrieteni) {
        this.nume = nume;
        this.prenume = prenume;
        this.ID = ID;
        this.numePrieteni = new String[numePrieteni.length];
        if (numePrieteni.length >= 0) System.arraycopy(numePrieteni, 0, this.numePrieteni, 0, numePrieteni.length);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public long getID() {
        return ID;
    }

}
