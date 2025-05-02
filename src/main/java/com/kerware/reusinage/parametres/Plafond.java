package com.kerware.reusinage.parametres;

/**
 * Différents plafonds liés au calcul des impôts.
 */
public enum Plafond {

    // Plafond de baisse maximale par demi part
    PLAFOND_DEMIPART(1759);

    private int plafond;

    Plafond(int plafond) {
        this.plafond = plafond;
    }

    public int getPlafond() {
        return plafond;
    }
}
