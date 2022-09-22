package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import lombok.Getter;
import lombok.Setter;

/**
 * The default qualifier when AI does not have any selector.
 * There is no need to set any scorer.
 */
public class DefaultQualifier<T extends AIContext> extends BaseQualifier<T> {

    @Getter
    @Setter
    private float score = 1.0f;

    @Override
    public float score(T context) {
        return score;
    }

}
