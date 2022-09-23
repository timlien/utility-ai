package com.tingshulien.game.utility.curve;

public class LogisticCurve extends BaseResponseCurve {

    @Override
    public double map(double x) {
        return sanitize((m / (1 + Math.exp(-10.0 * k * (x - 0.5 - b)))) + c);
    }

    /**
     * Increasing logistic curve
     *
     * <a href="https://www.desmos.com/calculator/0wxet4s23k">Increasing logistic curve graph</a>
     */
    public static LogisticCurve increasingLogisticCurve() {
        final LogisticCurve curve = new LogisticCurve();
        curve.m = 1;
        curve.k = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * Decreasing logistic curve
     *
     * <a href="https://www.desmos.com/calculator/hc8qixev5k">Increasing logistic curve graph</a>
     */
    public static LogisticCurve decreasingLogisticCurve() {
        final LogisticCurve curve = new LogisticCurve();
        curve.m = 1;
        curve.k = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }
}
