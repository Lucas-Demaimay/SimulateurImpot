package com.kerware.reusinage;

import com.kerware.reusinage.gestion.StategieCalcul;
import com.kerware.reusinage.utile.DonneeImpot;

public class CalculateurImpot {

    private StategieCalcul calculAbattement;
    private StategieCalcul calculBaisseImpot;
    private StategieCalcul calculCEHR;
    private StategieCalcul calculDecote;
    private StategieCalcul calculImpotDeclarant;
    private StategieCalcul calculImpotFinal;
    private StategieCalcul calculImpotFoyerFiscal;
    private StategieCalcul calculPart;
    private StategieCalcul calculPartDeclarant;
    private StategieCalcul calculRevenuFiscalReference;

    public static DonneeImpot donnee;
    public static double CEHR;
    public static int revenuFiscalReference;
    public static int abattement;
    public static double nbPartsFoyerFiscal;
    public static int impotAvantDecote;
    public static int decote;
    public static int impotSurRevenuNet;
    public static double impotFoyerFiscal;
    public static double impotDeclarant;
    public static double nbPart;
    public static double nbPartDeclarant;


    public void setCalculAbattement(StategieCalcul calculAbattement) {
        this.calculAbattement = calculAbattement;
    }

    public void setCalculBaisseImpot(StategieCalcul calculBaisseImpot) {
        this.calculBaisseImpot = calculBaisseImpot;
    }

    public void setCalculCEHR(StategieCalcul calculCEHR) {
        this.calculCEHR = calculCEHR;
    }

    public void setCalculDecote(StategieCalcul calculDecote) {
        this.calculDecote = calculDecote;
    }

    public void setCalculImpotDeclarant(StategieCalcul calculImpotDeclarant) {
        this.calculImpotDeclarant = calculImpotDeclarant;
    }

    public void setCalculImpotFinal(StategieCalcul calculImpotFinal) {
        this.calculImpotFinal = calculImpotFinal;
    }

    public void setCalculImpotFoyerFiscal(StategieCalcul calculImpotFoyerFiscal) {
        this.calculImpotFoyerFiscal = calculImpotFoyerFiscal;
    }

    public void setCalculPart(StategieCalcul calculPart) {
        this.calculPart = calculPart;
    }
    public void setCalculPartDclarant(StategieCalcul calculPartDeclarant) {
        this.calculPartDeclarant = calculPartDeclarant;
    }

    public void setCalculRevenuFiscalReference(StategieCalcul calculRevenuFiscalReference) {
        this.calculRevenuFiscalReference = calculRevenuFiscalReference;
    }

    public void lancer(DonneeImpot donneeImpot) {
        donnee = donneeImpot;

        calculAbattement.initialiser();
        abattement = (int) calculAbattement.calcul();

        calculRevenuFiscalReference.initialiser();
        revenuFiscalReference = (int) calculRevenuFiscalReference.calcul();

        calculPartDeclarant.initialiser();
        nbPartDeclarant = calculPartDeclarant.calcul();

        calculPart.initialiser();
        nbPart = calculPart.calcul();

        calculCEHR.initialiser();
        CEHR = calculCEHR.calcul();

        calculImpotDeclarant.initialiser();
        impotDeclarant = calculImpotDeclarant.calcul();

        calculImpotFoyerFiscal.initialiser();
        impotFoyerFiscal = calculImpotFoyerFiscal.calcul();

        calculBaisseImpot.initialiser();
        impotAvantDecote = (int) calculBaisseImpot.calcul();

        calculDecote.initialiser();
        decote = (int) calculDecote.calcul();

        calculImpotFinal.initialiser();
        impotSurRevenuNet = (int) calculImpotFinal.calcul();


    }

    public double getCEHR() {
        return CEHR;
    }

    public int getRevenuFiscalReference() {
        return revenuFiscalReference;
    }

    public int getAbattement() {
        return abattement;
    }

    public double getNbPartsFoyerFiscal() {
        return nbPartsFoyerFiscal;
    }

    public int getImpotAvantDecote() {
        return impotAvantDecote;
    }

    public int getDecote() {
        return decote;
    }

    public int getImpotSurRevenuNet() {
        return impotSurRevenuNet;
    }

}
