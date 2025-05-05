package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.parametres.TranchesCEHR;
import com.kerware.reusinage.utile.DonneeImpot;

//EXIGENCE : EXG_IMPOT_07
public class CalculCEHR extends StategieCalcul {

    private double nbPart;
    private int revenuFiscalReference;

    public void initialiser() {
        nbPart = CalculateurImpot.nbPart;
        revenuFiscalReference = CalculateurImpot.revenuFiscalReference;
    }

    @Override
    public double calcul() {
        double contributionExceptionelle = 0;

        for (TranchesCEHR tranche : TranchesCEHR.values()) {
            if (revenuFiscalReference >= tranche.getValeurDebutDeTranche()
                    && revenuFiscalReference <= tranche.getValeurFinDeTranche()) {
                if (nbPart == 1) {
                    contributionExceptionelle += (revenuFiscalReference - tranche.getValeurDebutDeTranche())
                            * tranche.getTauxCEHRCelibataire();
                } else {
                    contributionExceptionelle += (revenuFiscalReference - tranche.getValeurDebutDeTranche())
                            * tranche.getTauxCEHRCouple();
                }
            }
        }

        contributionExceptionelle = Math.round(contributionExceptionelle);

        return contributionExceptionelle;
    }

}
