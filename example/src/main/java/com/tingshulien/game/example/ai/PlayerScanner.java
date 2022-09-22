package com.tingshulien.game.example.ai;

import com.tingshulien.game.example.SurvivalAIContext;
import com.tingshulien.game.example.action.ScanForActor;
import com.tingshulien.game.example.action.ScanForPosition;
import com.tingshulien.game.example.action.ScanForPowerUp;
import com.tingshulien.game.example.action.SurvivalCompositeAction;
import com.tingshulien.game.utility.qualifier.DefaultQualifier;
import com.tingshulien.game.utility.qualifier.Qualifier;
import com.tingshulien.game.utility.selector.HighestScoreWin;

public class PlayerScanner extends SurvivalAI {

    public PlayerScanner() {
        final HighestScoreWin<SurvivalAIContext> selector = new HighestScoreWin<>();
        setRoot(selector);

        final Qualifier<SurvivalAIContext> qualifier = new DefaultQualifier<>();
        selector.setDefaultQualifier(qualifier);

        final SurvivalCompositeAction action = new SurvivalCompositeAction();
        qualifier.setAction(action);

        action.add(new ScanForActor());
        action.add(new ScanForPowerUp());
        action.add(new ScanForPosition());
    }

}
