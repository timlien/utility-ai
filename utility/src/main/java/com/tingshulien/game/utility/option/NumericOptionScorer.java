package com.tingshulien.game.utility.option;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.utility.Utility;
import lombok.Getter;
import lombok.Setter;

public abstract class NumericOptionScorer<T extends AIContext, O> extends BaseOptionScorer<T, O> {

    @Getter
    @Setter
    private double min;

    @Getter
    @Setter
    private double max;

    @Override
    public double score(T context, O option) {
        return curve.map(Utility.normalize(Utility.cap(calculate(context, option), min, max), min, max));
    }

    protected abstract double calculate(T context, O option);

}
