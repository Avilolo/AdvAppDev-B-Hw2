package com.example.unitconvertion.Classes;

public class TemperatureConverter {
    public static double convert(double value, TemperatureUnit fromUnit, TemperatureUnit toUnit) {
        if (fromUnit == toUnit) {
            return value;
        }

        switch (fromUnit) {
            case CELSIUS:
                return toUnit == TemperatureUnit.FAHRENHEIT ? (value * 9/5) + 32 : value + 273.15;
            case FAHRENHEIT:
                return toUnit == TemperatureUnit.CELSIUS ? (value - 32) * 5/9 : ((value - 32) * 5/9) + 273.15;
            case KELVIN:
                return toUnit == TemperatureUnit.CELSIUS ? value - 273.15 : (value - 273.15) * 9/5 + 32;
            default:
                throw new IllegalArgumentException("Unknown temperature unit");
        }
    }
}

