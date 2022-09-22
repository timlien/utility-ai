package com.tingshulien.game.example;

import com.tingshulien.game.example.ai.SurvivalAI;
import java.util.ArrayList;
import java.util.List;

public class SurvivalAIComponent {

    private final SurvivalAIContextProvider contextProvider;

    private final List<SurvivalAI> ais;

    public SurvivalAIComponent(SurvivalPlayer player) {
        this.contextProvider = new SurvivalAIContextProvider(player);
        this.ais = new ArrayList<>();
    }

    public void update() {
        for (SurvivalAI ai : ais) {
            ai.process(contextProvider);
        }
    }

}
