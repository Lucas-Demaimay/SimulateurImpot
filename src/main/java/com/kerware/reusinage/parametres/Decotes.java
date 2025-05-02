package com.kerware.reusinage.parametres;

/**
 * Enumérations des différentes décotes. Chacune possède un seuil, une décote maximale autorisée et le taux associé à la décote.
 */
public enum Decotes {
    DECOTE_SEUL(1929, 873, 0.4525),
    DECOTE_COUPLE(3191, 1444, 0.4525);


    private int seuil;
    private int decoteMaximale;
    private double taux;

    Decotes(int seuil, int decoteMaximale, double taux){
        this.seuil = seuil;
        this.decoteMaximale = decoteMaximale;
        this.taux = taux;
    }

    public int getSeuil() {
        return seuil;
    }

    public int getDecoteMaximale() {
        return decoteMaximale;
    }

    public double getTaux() {
        return taux;
    }
}
