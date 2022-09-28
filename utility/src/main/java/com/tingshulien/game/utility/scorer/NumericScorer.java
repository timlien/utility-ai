package com.tingshulien.game.utility.scorer;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.utility.Utility;
import lombok.Getter;
import lombok.Setter;

public abstract class NumericScorer<T extends AIContext> extends BaseScorer<T> {

    @Getter
    @Setter
    private double min;

    @Getter
    @Setter
    private double max;

    @Override
    public double score(T context) {
        return curve.map(Utility.normalize(Utility.cap(calculate(context), min, max), min, max));
    }

    protected abstract float calculate(T context);

}
