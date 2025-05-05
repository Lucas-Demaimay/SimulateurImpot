package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.utile.DonneeImpot;

public class CalculRevenuFiscalReference extends StategieCalcul {

    private DonneeImpot donnee;
    private int abattement;

    public void initialiser(){
        this.donnee = CalculateurImpot.donnee;
        this.abattement = CalculateurImpot.abattement;
    }

    @Override
    public double calcul() {
        double revenuFiscalReference = donnee.getRevenuNetDeclarant1() + donnee.getRevenuNetDeclarant2() - abattement;

        if(revenuFiscalReference < 0){
            return 0;
        }
        return revenuFiscalReference;
    }

}
