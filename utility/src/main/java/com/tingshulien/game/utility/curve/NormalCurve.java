package com.tingshulien.game.utility.curve;

public class NormalCurve extends BaseResponseCurve {

    @Override
    public double map(double x) {
        return sanitize(m * Math.exp(-30.0 * k * (x - b - 0.5) * (x - b - 0.5)) + c);
    }

    /**
     * Normal distribution curve
     *
     * <a href="https://www.desmos.com/calculator/hhays80zmw">Normal distribution curve graph</a>
     */
    public static NormalCurve normalDistributionCurve() {
        final NormalCurve curve = new NormalCurve();
        curve.m = 1;
        curve.k = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * Inverse normal distribution curve
     *
     * <a href="https://www.desmos.com/calculator/7zdo1xr0ka">Inverse normal distribution curve graph</a>
     */
    public static NormalCurve inverseNormalDistributionCurve() {
        final NormalCurve curve = new NormalCurve();
        curve.m = -1;
        curve.k = 1;
        curve.b = 0;
        curve.c = 1;
        return curve;
    }

}
