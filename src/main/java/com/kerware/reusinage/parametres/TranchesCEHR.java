package com.kerware.reusinage.parametres;

import com.kerware.reusinage.utile.Tranche;

/**
 * Enumérations des différentes tranches de la contribution exceptionelle sur
 * les hauts revenus.
 * Le taux pour un célibataire et celui pour un couple sont associés à la
 * tranche.
 */
public enum TranchesCEHR {
    TRANCHE_00(0, 24999, 0.0, 0.0),
    TRANCHE_01(0, 24999, 0.03, 0.0),
    TRANCHE_02(0, 24999, 0.04, 0.03),
    TRANCHE_03(0, 24999, 0.04, 0.04);

    private Tranche tranche;
    private double tauxCEHRCelibataire;
    private double tauxCEHRCouple;

    TranchesCEHR(int valeurDebutDeTranche, int valeurFinDeTranche, double tauxCEHRCelibataire, double tauxCEHRCouple) {
        this.tranche = new Tranche(valeurDebutDeTranche, valeurFinDeTranche);
        this.tauxCEHRCelibataire = tauxCEHRCelibataire;
        this.tauxCEHRCouple = tauxCEHRCouple;
    }

    public int getValeurDebutDeTranche() {
        return tranche.getMinimum();
    }

    public int getValeurFinDeTranche() {
        return tranche.getMaximum();
    }

    public double getTauxCEHRCelibataire() {
        return tauxCEHRCelibataire;
    }

    public double getTauxCEHRCouple() {
        return tauxCEHRCouple;
    }

}
