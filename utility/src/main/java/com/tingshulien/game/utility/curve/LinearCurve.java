package com.tingshulien.game.utility.curve;

public class LinearCurve extends BaseResponseCurve {

    @Override
    public float map(float x) {
        return m * (x - b) + c;
    }

}
