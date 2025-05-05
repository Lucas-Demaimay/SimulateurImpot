package com.kerware.reusinage;

import com.kerware.reusinage.gestion.CalculAbattement;
import com.kerware.reusinage.gestion.CalculBaisseImpot;
import com.kerware.reusinage.gestion.CalculCEHR;
import com.kerware.reusinage.gestion.CalculDecote;
import com.kerware.reusinage.gestion.CalculImpotDeclarant;
import com.kerware.reusinage.gestion.CalculImpotFinal;
import com.kerware.reusinage.gestion.CalculImpotFoyerFiscal;
import com.kerware.reusinage.gestion.CalculPart;
import com.kerware.reusinage.gestion.CalculRevenuFiscalReference;
import com.kerware.reusinage.utile.DonneeImpot;

public class CreateurSimulateur {

    public static SimulateurReusine creerSimulateurImpot2024(DonneeImpot donnee) {
        CalculateurImpot calculateur = new CalculateurImpot();

        calculateur.setCalculAbattement(new CalculAbattement());
        calculateur.setCalculBaisseImpot(new CalculBaisseImpot());
        calculateur.setCalculCEHR(new CalculCEHR());
        calculateur.setCalculDecote(new CalculDecote());
        calculateur.setCalculImpotDeclarant(new CalculImpotDeclarant());
        calculateur.setCalculImpotFinal(new CalculImpotFinal());
        calculateur.setCalculImpotFoyerFiscal(new CalculImpotFoyerFiscal());
        calculateur.setCalculPart(new CalculPart());
        calculateur.setCalculRevenuFiscalReference(new CalculRevenuFiscalReference());

        SimulateurReusine simulateur = new SimulateurReusine();
        simulateur.setCalculateur(calculateur);
        simulateur.setRevenusNetDeclarant1(donnee.getRevenuNetDeclarant1());
        simulateur.setRevenusNetDeclarant2(donnee.getRevenuNetDeclarant2());
        simulateur.setNbEnfantsSituationHandicap(donnee.getNbEnfantsHandicapes());
        simulateur.setParentIsole(donnee.isParentIsole());
        simulateur.setNbEnfantsACharge(donnee.getNbEnfants());
        simulateur.setSituationFamiliale(donnee.getSituationFamiliale());
        return simulateur;
    }

}
