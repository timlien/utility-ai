package com.tingshulien.game.utility.curve;

public class LogitCurve extends BaseResponseCurve {

    @Override
    public double map(double x) {
        return sanitize(m * Math.log((x - b) / (1.0 - (x - b))) / 5.0 + 0.5 + c);
    }

    /**
     * Increasing logit curve
     *
     * <a href="https://www.desmos.com/calculator/klzjnjsibp">Increasing logit curve graph</a>
     */
    public static LogitCurve increasingLogitCurve() {
        final LogitCurve curve = new LogitCurve();
        curve.m = 1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

    /**
     * Decreasing logit curve
     *
     * <a href="https://www.desmos.com/calculator/ajknuxad76">Decreasing logit curve graph</a>
     */
    public static LogitCurve decreasingLogitCurve() {
        final LogitCurve curve = new LogitCurve();
        curve.m = -1;
        curve.b = 0;
        curve.c = 0;
        return curve;
    }

}
