package com.tingshulien.game.utility.action;

import com.tingshulien.game.utility.AIContext;

public abstract class BaseAction<T extends AIContext> implements Action<T> {

    @Override
    public abstract void execute(T context);

    @Override
    public abstract void stop(T context);

}
