package com.tingshulien.game.utility.curve;

import lombok.Getter;
import lombok.Setter;

public abstract class BaseResponseCurve implements ResponseCurve {

    /**
     * slope
     */
    @Getter
    @Setter
    double m;

    /**
     * exponent
     */
    @Getter
    @Setter
    double k;

    /**
     * X-axis shift
     */
    @Getter
    @Setter
    double b;

    /**
     * Y-axis shift
     */
    @Getter
    @Setter
    double c;

    @Override
    public abstract double map(double x);

    protected double sanitize(double value) {
        if (Double.isInfinite(value)) {
            return 0.0;
        } else if (Double.isNaN(value)) {
            return 0.0;
        } else if (value < 0.0) {
            return 0.0;
        } else if (value > 1.0) {
            return 1.0;
        } else {
            return value;
        }
    }

}
