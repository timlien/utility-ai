package com.tingshulien.game.utility.curve;

public class LinearCurve extends BaseResponseCurve {

    @Override
    public double map(double x) {
        return sanitize(m * (x - b) + c);
    }

    /**
     * Increasing linear curve
     *
     * <a href="https://www.desmos.com/calculator/mh2mnkdvny">Increasing linear curve</a>
     */
    public static LinearCurve increasingLinearCurve() {
        final LinearCurve curve = new LinearCurve();
        curve.m = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * Decreasing linear curve
     *
     * <a href="https://www.desmos.com/calculator/kbxsjvlwwm">Decreasing linear curve</a>
     */
    public static LinearCurve decreasingLinearCurve() {
        final LinearCurve curve = new LinearCurve();
        curve.m = -1;
        curve.b = 1;
        curve.c = 0;
        return curve;
    }

}
