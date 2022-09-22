package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.action.Action;
import com.tingshulien.game.utility.scorer.Scorer;
import com.tingshulien.game.utility.selector.Selector;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseQualifier<T extends AIContext> implements Qualifier<T> {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    float weight = 1.0f;

    @Getter
    @Setter
    List<Scorer<T>> scorers;

    @Getter
    @Setter
    Action<T> action;

    @Getter
    @Setter
    Selector<T> selector;

    public Qualifier<T> select(T context) {
        if (action != null) {
            return this;
        } else {
            return selector.select(context);
        }
    }

    @Override
    public abstract float score(T context);

}
