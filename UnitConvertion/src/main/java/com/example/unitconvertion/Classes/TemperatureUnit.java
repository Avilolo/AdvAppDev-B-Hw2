package com.example.unitconvertion.Classes;

import com.example.unitconvertion.Interface.Unit;

public enum TemperatureUnit implements Unit {
    CELSIUS("Celsius"),
    FAHRENHEIT("Fahrenheit"),
    KELVIN("Kelvin");

    private final String unitName;

    TemperatureUnit(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }
}

