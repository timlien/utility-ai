package com.tingshulien.game.utility.selector;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.qualifier.Qualifier;
import lombok.Getter;
import lombok.Setter;

public class HighestScoreWin<T extends AIContext> extends BaseSelector<T> {

    @Getter
    @Setter
    private float minScoreThreshold = 0f;

    @Override
    public Qualifier<T> select(T context) {
        Qualifier<T> highestScoreQualifier = defaultQualifier;
        float highestScore = defaultQualifier != null ? defaultQualifier.score(context) : Float.MIN_VALUE;

        for (Qualifier<T> qualifier : qualifiers) {
            final var score = qualifier.score(context) * qualifier.getWeight();
            if (score <= highestScore) {
                continue;
            }

            highestScore = score;
            highestScoreQualifier = qualifier;
        }

        if (highestScoreQualifier == null || highestScore < minScoreThreshold) {
            return null;
        }

        return highestScoreQualifier.select(context);
    }

}
