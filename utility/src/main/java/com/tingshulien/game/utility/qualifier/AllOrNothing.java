package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.scorer.Scorer;
import lombok.Getter;
import lombok.Setter;

/**
 * All OptionScorers need to score above the threshold, before the Qualifier returns its score, otherwise it returns zero (0).
 */
public class AllOrNothing<T extends AIContext> extends BaseQualifier<T> {

    @Getter
    @Setter
    private float threshold;

    @Override
    public float score(T context) {
        var totalScore = 0.0f;

        for (Scorer<T> scorer : scorers) {
            var score = scorer.score(context);
            if (score < threshold) {
                return 0;
            }

            totalScore += score;
        }

        return totalScore;
    }

}
