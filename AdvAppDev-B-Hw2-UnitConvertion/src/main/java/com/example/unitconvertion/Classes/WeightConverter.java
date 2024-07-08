package com.example.unitconvertion.Classes;

public class WeightConverter {
    public static double convert(double value, WeightUnit fromUnit, WeightUnit toUnit) {
        double valueInGrams = value * fromUnit.getToGramFactor();
        return valueInGrams / toUnit.getToGramFactor();
    }
}
