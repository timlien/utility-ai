package com.tingshulien.game.utility;

import com.tingshulien.game.utility.action.Action;
import com.tingshulien.game.utility.selector.Selector;
import lombok.Getter;
import lombok.Setter;

public class AI<T extends AIContext> {

    @Getter
    @Setter
    private float interval = 1.0f;

    @Getter
    @Setter
    private float startDelay = 0.0f;

    @Getter
    @Setter
    private Selector<T> root;

    @Getter
    @Setter
    private Action<T> currentAction;

    public void process(AIContextProvider<T> contextProvider) {
        contextProvider.updateAIContext();

        var context = contextProvider.getAIContext();
        var bestQualifier = root.select(context);

        if (currentAction != null && (bestQualifier == null || bestQualifier.getAction() != null)) {
            currentAction.stop(context);
        }

        if (bestQualifier != null) {
            currentAction = bestQualifier.getAction();
        }

        if (currentAction != null) {
            currentAction.execute(context);
        }
    }

}
