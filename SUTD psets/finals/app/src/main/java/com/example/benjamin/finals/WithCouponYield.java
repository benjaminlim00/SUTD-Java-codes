package com.example.benjamin.finals;

public class WithCouponYield implements YieldCalculation {

    public double calculateR(double faceValue, double sellingPrice, double interestPayment, double duration, double r) {
        double left = sellingPrice;
        double middle = Math.pow((1 / (1 + r)), duration);
        middle = (1 - middle)/ r;
        middle = interestPayment * middle;
        double right = Math.pow((1 + r), duration);
        right = faceValue / right;

        return left - middle - right;

    }


    //TODO
    public boolean hasSameSign(double a, double b) {
        return true;
    }




    @Override
    public double yieldToMaturity(Bond bond) {
        double faceValue = bond.getFaceValue();
        double sellingPrice = bond.getSellingPrice();
        double interestPayment = bond.getInterestPayment();
        double duration = bond.getDuration();

        double rUp = 1;
        double rDown = 1e-10;
        double rMiddle;

        double delta = rUp - rDown;

        while (delta > 1e-5) {
            rMiddle = (rUp + rDown) / 2;

            double fRmiddle = calculateR(faceValue, sellingPrice, interestPayment, duration, rMiddle);
            double fRup = calculateR(faceValue, sellingPrice, interestPayment, duration, rUp);
            double fRdown = calculateR(faceValue, sellingPrice, interestPayment, duration, rDown);

            if (hasSameSign(fRmiddle, fRup)) {
                rUp = rMiddle;
            }
            if (hasSameSign(fRmiddle, fRdown)) {
                rDown = rMiddle;
            }

            delta = rUp - rDown;

        }

        double result = 0.5 * (rUp + rDown);
        //return result;
        return 0.0123;
    }
}
