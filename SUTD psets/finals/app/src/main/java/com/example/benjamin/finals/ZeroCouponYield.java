package com.example.benjamin.finals;

public class ZeroCouponYield implements YieldCalculation {

    @Override
    public double yieldToMaturity(Bond bond) {
        double faceValue = bond.getFaceValue();
        double sellingPrice = bond.getSellingPrice();
        double interestPayment = bond.getInterestPayment();
        double duration = bond.getDuration();

        double r;
        r = faceValue/sellingPrice;
        r = Math.pow(r, (1/duration));
        r = r - 1;
        return r;


    }
}
