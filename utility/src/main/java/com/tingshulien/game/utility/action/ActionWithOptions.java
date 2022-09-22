package com.tingshulien.game.utility.action;

import com.tingshulien.game.utility.AIContext;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public abstract class ActionWithOptions<T extends AIContext, O> extends BaseAction<T> {

    @Getter
    @Setter
    private List<OptionScorer<T, O>> scorers;

    protected O getBest(T context, List<O> options) {
        O bestOption = null;
        float bestScore = Float.MIN_VALUE;

        for (var option: options) {
            float score = 0.0f;
            for (OptionScorer<T, O> scorer : scorers) {
                score += scorer.score(context, option);
            }

            if (score > bestScore) {
                bestOption = option;
                bestScore = score;
            }
        }

        return bestOption;
    }

}
