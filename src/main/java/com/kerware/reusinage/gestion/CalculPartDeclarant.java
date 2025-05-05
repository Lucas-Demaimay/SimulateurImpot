package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.utile.DonneeImpot;
import com.kerware.simulateur.SituationFamiliale;

 // EXIG  : EXG_IMPOT_03
public class CalculPartDeclarant extends StategieCalcul {

    DonneeImpot donnee;

    public void initialiser() {
        this.donnee = CalculateurImpot.donnee;
    }

    @Override
    public double calcul() {
        double nbPart = 1;

        if (donnee.getSituationFamiliale() == SituationFamiliale.MARIE
                || donnee.getSituationFamiliale() == SituationFamiliale.PACSE) {
            nbPart++;
        }

        return nbPart;
    }

}
