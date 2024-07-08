package com.example.unitconvertion.Classes;

public class LengthConverter {
    public static double convert(double value, LengthUnit fromUnit, LengthUnit toUnit) {
        double valueInMeters = value * fromUnit.getToMeterFactor();
        return valueInMeters / toUnit.getToMeterFactor();
    }
}

