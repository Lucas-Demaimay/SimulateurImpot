package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.parametres.Decotes;

// EXIGENCE : EXG_IMPOT_06
public class CalculDecote extends StategieCalcul {

    private double nbPartDeclarant;
    private double impot;

    public void initialiser() {
        nbPartDeclarant = CalculateurImpot.nbPartDeclarant;
        impot = CalculateurImpot.impotAvantDecote;
    }

    @Override
    public double calcul() {
        double decote = 0;

        if (nbPartDeclarant == 1) {
            if (impot < Decotes.DECOTE_SEUL.getSeuil()) {
                decote = Decotes.DECOTE_SEUL.getDecoteMaximale() - (impot * Decotes.DECOTE_SEUL.getTaux());
            }
        }

        if (nbPartDeclarant == 2) {
            if (impot < Decotes.DECOTE_COUPLE.getSeuil()) {
                decote = Decotes.DECOTE_COUPLE.getDecoteMaximale() - (impot * Decotes.DECOTE_COUPLE.getTaux());
            }
        }

        decote = Math.round(decote);

        if (impot <= decote) {
            decote = impot;
        }

        return decote;
    }

}
