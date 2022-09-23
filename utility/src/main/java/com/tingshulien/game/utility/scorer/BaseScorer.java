package com.tingshulien.game.utility.scorer;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.curve.ResponseCurve;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseScorer<T extends AIContext> implements Scorer<T> {

    @Getter
    @Setter
    ResponseCurve curve;

    @Override
    public abstract double score(T context);

}
