package com.kerware.reusinage.gestion;

import com.kerware.reusinage.CalculateurImpot;

public class CalculImpotFinal extends StategieCalcul {

    private double impot;
    private double decote;
    private double contributionExceptionelle;

    public void initialiser(){
        this.impot = CalculateurImpot.impotAvantDecote;
        this.decote = CalculateurImpot.decote;
        this.contributionExceptionelle = CalculateurImpot.CEHR;
    }
    

    @Override
    public double calcul() {
        double resultat = (impot - decote) + contributionExceptionelle;

        return Math.round(resultat);
    }

}
