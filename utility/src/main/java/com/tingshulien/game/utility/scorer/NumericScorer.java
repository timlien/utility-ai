package com.tingshulien.game.utility.scorer;

import com.tingshulien.game.utility.AIContext;
import lombok.Getter;
import lombok.Setter;

public abstract class NumericScorer<T extends AIContext> extends BaseScorer<T> {

    @Getter
    @Setter
    private float min;

    @Getter
    @Setter
    private float max;

    @Override
    public float score(T context) {
        final float rawScore = calculate(context);
        final float capScore = Math.min(Math.max(rawScore, min), max);
        final float normalizedScore = (capScore - min) / (max - min);
        return curve.map(normalizedScore);
    }

    protected abstract float calculate(T context);

}
