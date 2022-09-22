package com.tingshulien.game.utility.qualifier;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.action.Action;
import com.tingshulien.game.utility.scorer.Scorer;
import com.tingshulien.game.utility.selector.Selector;
import java.util.List;

public interface Qualifier<T extends AIContext> {

    Action<T> getAction();

    void setAction(Action<T> action);

    float getWeight();

    void setWeight(float weight);

    List<Scorer<T>> getScorers();

    void setScorers(List<Scorer<T>> scorers);

    Selector<T> getSelector();

    void setSelector(Selector<T> selector);

    Qualifier<T> select(T context);

    float score(T context);

}
