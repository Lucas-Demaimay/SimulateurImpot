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
import com.kerware.simulateur.ICalculateurImpot;

public class CreateurSimulateur {

    public static ICalculateurImpot creerSimulateurImpot2024() {
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
    
        return simulateur;
    }

}
