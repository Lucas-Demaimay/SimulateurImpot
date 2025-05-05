package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.parametres.TranchesRevenusImposables;

public class CalculImpotDeclarant extends StategieCalcul {

    private int revenuFiscalReference;
    private double nbPartDeclarant;

    public void initialiser() {
        this.revenuFiscalReference = CalculateurImpot.revenuFiscalReference;
        this.nbPartDeclarant = CalculateurImpot.nbPartDeclarant;
    }

    @Override
    public double calcul() {

        double revenuImposable = revenuFiscalReference / nbPartDeclarant;

        double impotDeclarant = 0;

        for (TranchesRevenusImposables tranche : TranchesRevenusImposables.values()) {
            if (revenuImposable >= tranche.getValeurDebutDeTranche()
                    && revenuImposable <= tranche.getValeurFinDeTranche()) {
                impotDeclarant += (revenuImposable - tranche.getValeurDebutDeTranche()) * tranche.getTauxImposition();
            }
        }

        impotDeclarant = impotDeclarant * nbPartDeclarant;
        impotDeclarant = Math.round(impotDeclarant);

        return impotDeclarant;

    }

}
