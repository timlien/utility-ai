package com.tingshulien.game.example;

import com.tingshulien.game.utility.AIContext;
import lombok.Getter;

public class SurvivalAIContext implements AIContext {

    @Getter
    private final SurvivalPlayer player;

    public SurvivalAIContext(SurvivalPlayer player) {
        this.player = player;
    }

}
