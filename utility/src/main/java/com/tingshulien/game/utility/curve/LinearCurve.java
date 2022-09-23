package com.tingshulien.game.utility.curve;

public class LinearCurve extends BaseResponseCurve {

    @Override
    public double map(double x) {
        return sanitize(m * (x - b) + c);
    }

    /**
     * Default linear curve
     *
     * <a href="https://www.desmos.com/calculator/mh2mnkdvny">Default logistic curve graph</a>
     */
    public static LinearCurve increasingLinearCurve() {
        final LinearCurve curve = new LinearCurve();
        curve.m = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

}
