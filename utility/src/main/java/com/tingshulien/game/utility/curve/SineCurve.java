package com.tingshulien.game.utility.curve;

public class SineCurve extends BaseResponseCurve {

    /**
     * Sine curve
     *
     * <a href="https://www.desmos.com/calculator/pzwuzafxlw">Sine curve graph</a>
     */
    public static SineCurve sineCurve() {
        final SineCurve curve = new SineCurve();
        curve.m = 1;
        curve.k = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * Sine curve lead by 0.5
     *
     * <a href="https://www.desmos.com/calculator/hperne8dg5">Sine curve lead by 0.5 graph</a>
     */
    public static SineCurve leadByZeroPointFiveSineWave() {
        final SineCurve curve = new SineCurve();
        curve.m = 1;
        curve.k = 1;
        curve.b = 0.5;
        curve.c = 0;
        return curve;
    }

    @Override
    public double map(double x) {
        return sanitize(0.5 * m * Math.sin(2.0 * Math.PI * (x - b)) + 0.5 + c);
    }

}
