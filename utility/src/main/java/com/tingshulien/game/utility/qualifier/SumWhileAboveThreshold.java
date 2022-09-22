package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.scorer.Scorer;
import lombok.Getter;
import lombok.Setter;

/**
 * The qualifier returns the sum of all scores until it reaches one that scores below given threshold.
 * Thus the order of the scorers is important.
 */
public class SumWhileAboveThreshold<T extends AIContext> extends BaseQualifier<T> {

    @Getter
    @Setter
    private float threshold;

    @Override
    public float score(T context) {
        var totalScore = 0.0f;

        for (Scorer<T> scorer : scorers) {
            var score = scorer.score(context);
            if (score <= threshold) {
                return totalScore;
            }

            totalScore += scorer.score(context);
        }

        return totalScore;
    }

}
