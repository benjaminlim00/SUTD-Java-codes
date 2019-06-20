package com.example.benjamin.finals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    public void check_calculation_yield() {

        Bond.BondBuilder bondBuilder = new Bond.BondBuilder();
        Bond bondtest = bondBuilder
                .setDuration(1)
                .setFaceValue(1000)
                .setSellingPrice(900)
                .setInterestPayment(0).createBond();
        bondtest.setYieldCalculation(new ZeroCouponYield());
        double result = bondtest.calculateYTM();
        result = result * 100;
        assertEquals(11.11, result);
    }
}