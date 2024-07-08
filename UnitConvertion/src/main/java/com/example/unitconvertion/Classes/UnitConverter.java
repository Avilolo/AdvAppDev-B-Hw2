package com.example.unitconvertion.Classes;

public class UnitConverter {

    public static double convertLength(double value, LengthUnit fromUnit, LengthUnit toUnit) {
        return LengthConverter.convert(value, fromUnit, toUnit);
    }

    public static double convertWeight(double value, WeightUnit fromUnit, WeightUnit toUnit) {
        return WeightConverter.convert(value, fromUnit, toUnit);
    }

    public static double convertTemperature(double value, TemperatureUnit fromUnit, TemperatureUnit toUnit) {
        return TemperatureConverter.convert(value, fromUnit, toUnit);
    }
}

