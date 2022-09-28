package com.tingshulien.game.utility.option;

import com.tingshulien.game.utility.AIContext;
import lombok.Getter;
import lombok.Setter;

public abstract class TagOptionScorer<E extends Enum<E>, T extends AIContext, O> extends BaseOptionScorer<T, O> {

    @Getter
    @Setter
    private E tag;

    @Override
    public double score(T context, O option) {
        final double normalizedScore = isTagged(context, option) ? 1.0 : 0.0;
        return curve.map(normalizedScore);
    }

    protected abstract boolean isTagged(T context, O option);

}
