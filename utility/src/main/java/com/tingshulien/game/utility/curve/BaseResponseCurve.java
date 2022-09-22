package com.tingshulien.game.utility.curve;

import lombok.Getter;
import lombok.Setter;

public abstract class BaseResponseCurve implements ResponseCurve {

    @Getter
    @Setter
    float m;

    @Getter
    @Setter
    float k;

    @Getter
    @Setter
    float b;

    @Getter
    @Setter
    float c;

    @Override
    public abstract float map(float x);

}
