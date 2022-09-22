package com.tingshulien.game.utility.selector;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.qualifier.Qualifier;

public interface Selector<T extends AIContext> {

    void add(Qualifier<T> qualifier);

    Qualifier<T> select(T context);

}
