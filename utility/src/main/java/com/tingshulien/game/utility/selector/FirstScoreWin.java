package com.tingshulien.game.utility.selector;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.qualifier.Qualifier;

/**
 * The first score above the score of default qualifier will win.
 * @param <T>
 */
public class FirstScoreWin<T extends AIContext> extends BaseSelector<T> {

    @Override
    public Qualifier<T> select(T context) {
        Qualifier<T> firstScoreQualifier = defaultQualifier;

        for (Qualifier<T> qualifier : qualifiers) {
            final float score = qualifier.score(context) * qualifier.getWeight();
            if (score <= 0) {
                continue;
            }

            firstScoreQualifier = qualifier;
            break;
        }

        return firstScoreQualifier;
    }

}
