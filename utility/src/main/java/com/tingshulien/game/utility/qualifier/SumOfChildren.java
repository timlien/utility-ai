package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.scorer.Scorer;

/**
 * The qualifier returns the sum of all scores.
 */
public class SumOfChildren<T extends AIContext> extends BaseQualifier<T> {

    @Override
    public float score(T context) {
        var totalScore = 0.0f;

        for (Scorer<T> scorer : scorers) {
            totalScore += scorer.score(context);
        }

        return totalScore;
    }

}
