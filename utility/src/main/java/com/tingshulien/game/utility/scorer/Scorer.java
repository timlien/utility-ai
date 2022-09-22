package com.tingshulien.game.utility.scorer;

import com.tingshulien.game.utility.AIContext;

public interface Scorer<T extends AIContext> {

    float score(T context);

}
