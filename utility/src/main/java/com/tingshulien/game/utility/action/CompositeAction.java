package com.tingshulien.game.utility.action;

import com.tingshulien.game.utility.AIContext;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class CompositeAction<T extends AIContext> implements Action<T> {

    @Getter
    @Setter
    private List<Action<T>> actions;

    public CompositeAction() {
        this.actions = new ArrayList<>();
    }

    @Override
    public void execute(T context) {
        for (Action<T> action : actions) {
            action.execute(context);
        }
    }

    @Override
    public void stop(T context) {
        for (Action<T> action : actions) {
            action.stop(context);
        }
    }

    public void add(Action<T> action) {
        this.actions.add(action);
    }

}
