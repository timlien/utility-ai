package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import lombok.Getter;
import lombok.Setter;

/**
 * Always return fixed score without any scorers.
 */
public class FixedScore<T extends AIContext> extends BaseQualifier<T> {

    @Getter
    @Setter
    private int score;

    @Override
    public float score(T context) {
        return score;
    }

}
