package com.kerware.reusinage.utile;

public class Tranche {

    public int maximum;
    public int minimum;

    public Tranche(int minimum, int maximum){
        if(minimum > maximum) throw new IllegalArgumentException("La tranche doit avoir un maximum supérieur au minimum");
        
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

}
