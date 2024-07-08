package com.example.unitconvertion.Classes;
import com.example.unitconvertion.Interface.Unit;

public enum WeightUnit implements Unit {
    GRAM("Gram", 1.0),
    KILOGRAM("Kilogram", 1000.0),
    MILLIGRAM("Milligram", 0.001),
    POUND("Pound", 453.592),
    OUNCE("Ounce", 28.3495);

    private final String unitName;
    private final double toGramFactor;

    WeightUnit(String unitName, double toGramFactor) {
        this.unitName = unitName;
        this.toGramFactor = toGramFactor;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    public double getToGramFactor() {
        return toGramFactor;
    }
}

