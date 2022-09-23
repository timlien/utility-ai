package com.tingshulien.game.utility.curve;

/**
 * <a href="https://www.desmos.com/calculator/hbjn2tyiiw">Polynomial Curve.</a>
 */
public class PolynomialCurve extends BaseResponseCurve {

    @Override
    public double map(double x) {
        return sanitize((m * Math.pow(x - b, k)) + c);
    }

    /**
     * 遞增凸曲線
     *
     * <a href="https://www.desmos.com/calculator/zo8zhazkcs">Increasing convex polynomial curve graph</a>
     */
    public static PolynomialCurve increasingConvexPolynomialCurve() {
        final PolynomialCurve curve = new PolynomialCurve();
        curve.m = 1;
        curve.k = 0.5;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * 遞增凹曲線
     *
     * <a href="https://www.desmos.com/calculator/7jzhm8jidj">Increasing concave polynomial curve graph</a>
     */
    public static PolynomialCurve increasingConcavePolynomialCurve() {
        final PolynomialCurve curve = new PolynomialCurve();
        curve.m = 1;
        curve.k = 2;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * 遞減凸曲線
     *
     * <a href="https://www.desmos.com/calculator/mzenmlfkmg">Decreasing convex polynomial curve graph</a>
     */
    public static PolynomialCurve decreasingConvexPolynomialCurve() {
        final PolynomialCurve curve = new PolynomialCurve();
        curve.m = -1;
        curve.k = 2;
        curve.b = 0;
        curve.c = 1;
        return curve;
    }

    /**
     * 遞減凹曲線
     *
     * <a href="https://www.desmos.com/calculator/8l7w1cvprf">Decreasing concave polynomial curve graph</a>
     */
    public static PolynomialCurve decreasingConcavePolynomialCurve() {
        final PolynomialCurve curve = new PolynomialCurve();
        curve.m = -1;
        curve.k = 0.5;
        curve.b = 0;
        curve.c = 1;
        return curve;
    }

}
