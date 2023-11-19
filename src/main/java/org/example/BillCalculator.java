package org.example;

public class BillCalculator {

    public double calculate(double billValue, float serviceCharge) {
        return billValue + serviceCharge;
    }

    public double calculate(double billValue, float serviceCharge, double discount) {
        return (billValue - discount) + serviceCharge;
    }

    public double calculate(double billValue, float serviceCharge, short takeout) {
        return billValue + serviceCharge + takeout;
    }
}