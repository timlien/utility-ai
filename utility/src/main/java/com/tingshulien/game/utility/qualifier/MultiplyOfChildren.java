package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.scorer.Scorer;

public class MultiplyOfChildren<T extends AIContext> extends BaseQualifier<T> {

    @Override
    public float score(T context) {
        var totalScore = 0.0f;

        for (Scorer<T> scorer : scorers) {
            totalScore *= scorer.score(context);
        }

        return compensate(totalScore, scorers.size());
    }

    private float compensate(float value, int count) {
        float modificationFactor = 1.0f - (1.0f / count);
        float makeUpValue = (1.0f - value) * modificationFactor;
        return value + (value * makeUpValue);
    }

}
