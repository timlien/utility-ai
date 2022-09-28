package com.tingshulien.game.utility.option;

import com.tingshulien.game.utility.AIContext;

public interface OptionScorer<T extends AIContext, O> {

    double score(T context, O option);

}
