package com.kerware.reusinage;

import com.kerware.reusinage.utile.DonneeImpot;
import com.kerware.simulateur.ICalculateurImpot;
import com.kerware.simulateur.SituationFamiliale;

public class SimulateurReusine implements ICalculateurImpot {

    private DonneeImpot donnee;
    private CalculateurImpot calculateur;

    public void setCalculateur(CalculateurImpot calculateur) {
        this.calculateur = calculateur;
    }

    @Override
    public void setRevenusNetDeclarant1(int rn) {
        this.donnee.setRevenuNetDeclarant1(rn);
    }

    @Override
    public void setRevenusNetDeclarant2(int rn) {
        this.donnee.setRevenuNetDeclarant2(rn);
    }

    @Override
    public void setSituationFamiliale(SituationFamiliale sf) {
        this.donnee.setSituationFamiliale(sf);
    }

    @Override
    public void setNbEnfantsACharge(int nbe) {
        this.donnee.setNbEnfants(nbe);
    }

    @Override
    public void setNbEnfantsSituationHandicap(int nbesh) {
        this.setNbEnfantsSituationHandicap(nbesh);
    }

    @Override
    public void setParentIsole(boolean pi) {
        this.donnee.setParentIsole(pi);
    }

    @Override
    public void calculImpotSurRevenuNet() {
        calculateur.lancer(this.donnee);    
    }

    @Override
    public int getRevenuNetDeclatant1() {
        return this.donnee.getRevenuNetDeclarant1();
    }

    @Override
    public int getRevenuNetDeclatant2() {
        return this.donnee.getRevenuNetDeclarant2();
    }

    @Override
    public double getContribExceptionnelle() {
        return calculateur.getCEHR();
    }

    @Override
    public int getRevenuFiscalReference() {
        return calculateur.getRevenuFiscalReference();    
    }

    @Override
    public int getAbattement() {
        return calculateur.getAbattement();
    }

    @Override
    public double getNbPartsFoyerFiscal() {
        return calculateur.getNbPartsFoyerFiscal();
    }

    @Override
    public int getImpotAvantDecote() {
        return calculateur.getImpotAvantDecote();
    }

    @Override
    public int getDecote() {
        return calculateur.getDecote();    
    }

    @Override
    public int getImpotSurRevenuNet() {
        return calculateur.getImpotSurRevenuNet();
    }

}