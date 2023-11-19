package org.example;

public class BillCalculator {

    public double calculate(double billValue, float serviceCharge) {
        return billValue + serviceCharge;
    }

    public double calculate(double billValue, float serviceCharge, double discount) {
        double discountAmount = billValue * (discount / 100);
        return (billValue - discountAmount) + serviceCharge;
    }

    public double calculate(double billValue, float serviceCharge, short takeout) {
        return billValue + serviceCharge + takeout;
    }
}