package com.tingshulien.game.utility.input;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.qualifier.Qualifier;

public interface InputFactory<T extends AIContext> {

    float score(T context, Qualifier<T> qualifier);

}
