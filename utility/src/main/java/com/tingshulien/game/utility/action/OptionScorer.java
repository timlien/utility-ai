package com.tingshulien.game.utility.action;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.scorer.Scorer;

public interface OptionScorer<T extends AIContext, O> extends Scorer<T> {

    float score(T context, O option);

}
