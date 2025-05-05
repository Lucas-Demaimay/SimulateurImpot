package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.utile.DonneeImpot;
import com.kerware.simulateur.SituationFamiliale;

 // EXIG  : EXG_IMPOT_03
public class CalculPart extends StategieCalcul {

    DonneeImpot donnee;
    double nbPartDeclarant;

    public void initialiser() {
        this.donnee = CalculateurImpot.donnee;
        this.nbPartDeclarant = CalculateurImpot.nbPartDeclarant;
    }

    @Override
    public double calcul() {

        double nbPart = nbPartDeclarant;

        if (donnee.getNbEnfants() > 0) {
            if (donnee.getNbEnfants() <= 2) {
                nbPart += donnee.getNbEnfants() * 0.5;
            } else {
                nbPart += 1.0 + (donnee.getNbEnfants() - 2);
            }

            if (donnee.isParentIsole()) {
                nbPart += 0.5;
            }

            if (donnee.getSituationFamiliale() == SituationFamiliale.VEUF) {
                nbPart++;
            }
        }

        nbPart += donnee.getNbEnfantsHandicapes() * 0.5;

        return nbPart;
    }

}
