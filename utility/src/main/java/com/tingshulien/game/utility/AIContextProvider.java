package com.tingshulien.game.utility;

public interface AIContextProvider<T extends AIContext> {

    T getAIContext();

    void updateAIContext();

}
