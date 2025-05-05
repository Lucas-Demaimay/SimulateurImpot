package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.parametres.Plafond;

// EXIGENCE : EXG_IMPOT_05
public class CalculBaisseImpot extends StategieCalcul {

    private double impotDeclarant;
    private double impot;
    private double nbPart;
    private double nbPartDeclarant;

    public void initialiser() {
        this.impotDeclarant = CalculateurImpot.impotDeclarant;
        this.impot = CalculateurImpot.impotFoyerFiscal;
        this.nbPart = CalculateurImpot.nbPart;
        this.nbPartDeclarant = CalculateurImpot.nbPartDeclarant;
    }

    @Override
    public double calcul() {
        double baisseImpot = impotDeclarant - impot;
        double ecartParts = nbPart - nbPartDeclarant;

        double plafond = (ecartParts / 0.5) * Plafond.PLAFOND_DEMIPART.getPlafond();

        if (baisseImpot >= plafond) {
            impot = impotDeclarant - plafond;
        }

        return impot;
    }

}
