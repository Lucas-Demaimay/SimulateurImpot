package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;
import com.kerware.reusinage.parametres.Abattement;
import com.kerware.reusinage.utile.DonneeImpot;
import com.kerware.simulateur.SituationFamiliale;

public class CalculAbattement extends StategieCalcul {

    DonneeImpot donnee;

    public void initialiser(){
        this.donnee = CalculateurImpot.donnee;
    }

    @Override
    public double calcul() {
        long abattementDeclarant1 = Math.round(donnee.getRevenuNetDeclarant1() * Abattement.TAUX);
        long abattementDeclarant2 = Math.round(donnee.getRevenuNetDeclarant2() * Abattement.TAUX);

        if (abattementDeclarant1 > Abattement.LIMITE_MAXIMALE) {
            abattementDeclarant1 = Abattement.LIMITE_MAXIMALE;
        } else if (abattementDeclarant1 < Abattement.LIMITE_MINIMALE) {
            abattementDeclarant1 = Abattement.LIMITE_MINIMALE;
        }

        if ( donnee.getSituationFamiliale() == SituationFamiliale.MARIE || donnee.getSituationFamiliale() == SituationFamiliale.PACSE ) {
            if (abattementDeclarant2 > Abattement.LIMITE_MAXIMALE) {
                abattementDeclarant2 = Abattement.LIMITE_MAXIMALE;
            } else if (abattementDeclarant2 < Abattement.LIMITE_MINIMALE) {
                abattementDeclarant2 = Abattement.LIMITE_MINIMALE;
            }
        }

        return abattementDeclarant1 + abattementDeclarant2;    
    }

}
