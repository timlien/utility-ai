package com.tingshulien.game.utility.option;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.curve.ResponseCurve;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseOptionScorer<T extends AIContext, O> implements OptionScorer<T, O> {

    @Getter
    @Setter
    ResponseCurve curve;

    @Override
    public abstract double score(T context, O option);

}
