package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillCalculatorTest {

    @Test
    public void checkBillAndService() {
        // given
        double billValue = 50.0;
        float serviceCharge = 5.0f;
        BillCalculator calculator = new BillCalculator();

        // when
        double result = calculator.calculate(billValue, serviceCharge);

        // then
        assertEquals(55.0, result);
    }

    @Test
    public void checkBillAndServiceAndDiscount() {
        // given
        double billValue = 100.0;
        float serviceCharge = 8.0f;
        double discount = 15.0;
        BillCalculator calculator = new BillCalculator();

        // when
        double result = calculator.calculate(billValue, serviceCharge, discount);

        // then
        assertEquals(93.0, result);
    }

    @Test
    public void checkBillAndServiceAndTakeout() {
        // given
        double billValue = 75.0;
        float serviceCharge = 7.0f;
        short takeout = 2;
        BillCalculator calculator = new BillCalculator();

        // when
        double result = calculator.calculate(billValue, serviceCharge, takeout);

        // then
        assertEquals(84.0, result);
    }
}