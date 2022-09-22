package com.tingshulien.game.utility.action;

import com.tingshulien.game.utility.AIContext;

public interface Action<T extends AIContext> {

    void execute(T context);

    void stop(T context);

}
