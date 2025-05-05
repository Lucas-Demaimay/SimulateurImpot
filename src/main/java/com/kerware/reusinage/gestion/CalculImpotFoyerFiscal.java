package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.parametres.TranchesRevenusImposables;

public class CalculImpotFoyerFiscal extends StategieCalcul {
private int revenuFiscalReference;
    private double nbPart;

    public void initialiser(){
        this.revenuFiscalReference = CalculateurImpot.revenuFiscalReference;
        this.nbPart = CalculateurImpot.nbPart;
    }

    @Override
    public double calcul() {

        double revenuImposable = revenuFiscalReference / nbPart;

        double impotDeclarant = 0;

        for(TranchesRevenusImposables tranche : TranchesRevenusImposables.values()){
            if(revenuImposable >= tranche.getValeurDebutDeTranche() && revenuImposable <= tranche.getValeurFinDeTranche()){
                impotDeclarant += ( revenuImposable - tranche.getValeurDebutDeTranche()) * tranche.getTauxImposition();
            }
        }

        impotDeclarant = impotDeclarant * nbPart;
        impotDeclarant = Math.round(impotDeclarant);

        return impotDeclarant;
        
    }

}
