package com.tingshulien.game.utility.scorer;

import com.tingshulien.game.utility.AIContext;
import lombok.Getter;
import lombok.Setter;

public abstract class TagScorer<E extends Enum<E>, T extends AIContext> extends BaseScorer<T> {

    @Getter
    @Setter
    private E tag;

    @Override
    public float score(T context) {
        final float normalizedScore = isTagged(context) ? 1.0f : 0.0f;
        return curve.map(normalizedScore);
    }

    protected abstract boolean isTagged(T context);

}
