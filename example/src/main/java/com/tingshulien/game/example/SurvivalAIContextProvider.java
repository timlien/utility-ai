package com.tingshulien.game.example;

import com.tingshulien.game.utility.AIContextProvider;

public class SurvivalAIContextProvider implements AIContextProvider<SurvivalAIContext> {

    private final SurvivalAIContext context;

    public SurvivalAIContextProvider(SurvivalPlayer player) {
        this.context = new SurvivalAIContext(player);
    }

    @Override
    public SurvivalAIContext getAIContext() {
        return context;
    }

    @Override
    public void updateAIContext() {

    }

}
