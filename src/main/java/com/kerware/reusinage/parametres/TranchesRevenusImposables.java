package com.kerware.reusinage.parametres;

import com.kerware.reusinage.utile.Tranche;

/**
 * Enumération des différentes tranches de revenus imposables, avec le taux
 * associé à la tranche.
 */
public enum TranchesRevenusImposables {
    TRANCHE_00(0, 11293, 0.0),
    TRANCHE_01(11294, 28796, 0.11),
    TRANCHE_02(28797, 82340, 0.3),
    TRANCHE_03(82341, 177105, 0.41),
    TRANCHE_04(177106, Integer.MAX_VALUE, 0.45);

    private Tranche tranche;
    private double tauxImposition;

    TranchesRevenusImposables(int valeurDebutDeTranche, int valeurFinDeTranche, double tauxImposition) {
        this.tranche = new Tranche(valeurDebutDeTranche, valeurFinDeTranche);
        this.tauxImposition = tauxImposition;
    }

    public int getValeurDebutDeTranche() {
        return tranche.getMinimum();
    }

    public int getValeurFinDeTranche() {
        return tranche.getMaximum();
    }

    public double getTauxImposition() {
        return tauxImposition;
    }
}
