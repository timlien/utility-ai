package com.tingshulien.game.example;

import com.tingshulien.game.example.actor.Player;

public class SurvivalPlayer implements Player {

    private final SurvivalAIComponent component;

    public SurvivalPlayer() {
        this.component = new SurvivalAIComponent(this);
    }

    public void update() {
        component.update();
    }

}
