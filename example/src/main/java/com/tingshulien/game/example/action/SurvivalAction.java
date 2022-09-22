package com.tingshulien.game.example.action;

import com.tingshulien.game.example.SurvivalAIContext;
import com.tingshulien.game.utility.action.BaseAction;

public abstract class SurvivalAction extends BaseAction<SurvivalAIContext> {

    @Override
    public abstract void execute(SurvivalAIContext context);

    @Override
    public void stop(SurvivalAIContext context) {}

}
