package com.tingshulien.game.utility.action;

import com.tingshulien.game.utility.AIContext;

public class EmptyAction<T extends AIContext> extends BaseAction<T> {

    @Override
    public void execute(T context) {

    }

    @Override
    public void stop(T context) {

    }

}
