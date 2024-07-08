package com.example.unitconvertion.Classes;

import com.example.unitconvertion.Interface.Unit;

public enum LengthUnit implements Unit {
    METER("Meter", 1.0),
    KILOMETER("Kilometer", 1000.0),
    CENTIMETER("Centimeter", 0.01),
    MILLIMETER("Millimeter", 0.001),
    INCH("Inch", 0.0254),
    FOOT("Foot", 0.3048),
    YARD("Yard", 0.9144),
    MILE("Mile", 1609.34);

    private final String unitName;
    private final double toMeterFactor;

    LengthUnit(String unitName, double toMeterFactor) {
        this.unitName = unitName;
        this.toMeterFactor = toMeterFactor;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    public double getToMeterFactor() {
        return toMeterFactor;
    }
}
