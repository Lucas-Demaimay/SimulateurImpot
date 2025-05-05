package com.kerware.reusinage.utile;

import com.kerware.simulateur.SituationFamiliale;

public class DonneeImpot {

    private int revenuNetDeclarant1;
    private int revenuNetDeclarant2;

    private int nbEnfants;
    private int nbEnfantsHandicapes;

    private SituationFamiliale situationFamiliale;

    private boolean parentIsole;

    public DonneeImpot() { }

    public DonneeImpot(int revenuNetDeclarant1, int revenuNetDeclarant2, int nbEnfants, int nbEnfantsHandicapes,
            SituationFamiliale situationFamiliale, boolean parentIsole) {

        if (revenuNetDeclarant1 < 0 || revenuNetDeclarant2 < 0)
            throw new IllegalArgumentException("Le revenu net ne peut pas être négatif");

        if (nbEnfants < 0)
            throw new IllegalArgumentException("Le nombre d'enfants ne peut pas être négatif");

        if (nbEnfantsHandicapes < 0)
            throw new IllegalArgumentException("Le nombre d'enfants handicapés ne peut pas être négatif");

        if (situationFamiliale == null)
            throw new IllegalArgumentException("La situation familiale ne peut pas être null");

        if (nbEnfantsHandicapes > nbEnfants)
            throw new IllegalArgumentException(
                    "Le nombre d'enfants handicapés ne peut pas être supérieur au nombre d'enfants");

        if (nbEnfants > 7)
            throw new IllegalArgumentException("Le nombre d'enfants ne peut pas être supérieur à 7");

        boolean seul = situationFamiliale == SituationFamiliale.CELIBATAIRE
                || situationFamiliale == SituationFamiliale.DIVORCE || situationFamiliale == SituationFamiliale.VEUF;

        if (parentIsole && !seul)
            throw new IllegalArgumentException("Un parent isolé ne peut pas être marié ou pacsé");

        if (revenuNetDeclarant2 > 0 && seul)
            throw new IllegalArgumentException(
                    "Un célibataire, un divorcé ou un veuf ne peut pas avoir de revenu pour le déclarant 2");

        this.revenuNetDeclarant1 = revenuNetDeclarant1;
        this.revenuNetDeclarant2 = revenuNetDeclarant2;
        this.nbEnfants = nbEnfants;
        this.nbEnfantsHandicapes = nbEnfantsHandicapes;
        this.situationFamiliale = situationFamiliale;
        this.parentIsole = parentIsole;
    }

    public int getRevenuNetDeclarant1() {
        return revenuNetDeclarant1;
    }

    public int getRevenuNetDeclarant2() {
        return revenuNetDeclarant2;
    }

    public int getNbEnfants() {
        return nbEnfants;
    }

    public int getNbEnfantsHandicapes() {
        return nbEnfantsHandicapes;
    }

    public SituationFamiliale getSituationFamiliale() {
        return situationFamiliale;
    }

    public boolean isParentIsole() {
        return parentIsole;
    }

    public void setRevenuNetDeclarant1(int revenuNetDeclarant1) {
        this.revenuNetDeclarant1 = revenuNetDeclarant1;
    }

    public void setRevenuNetDeclarant2(int revenuNetDeclarant2) {
        this.revenuNetDeclarant2 = revenuNetDeclarant2;
    }

    public void setNbEnfants(int nbEnfants) {
        this.nbEnfants = nbEnfants;
    }

    public void setNbEnfantsHandicapes(int nbEnfantsHandicapes) {
        this.nbEnfantsHandicapes = nbEnfantsHandicapes;
    }

    public void setSituationFamiliale(SituationFamiliale situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public void setParentIsole(boolean parentIsole) {
        this.parentIsole = parentIsole;
    }

}
