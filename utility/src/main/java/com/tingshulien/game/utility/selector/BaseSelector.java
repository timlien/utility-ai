package com.tingshulien.game.utility.selector;

import com.tingshulien.game.utility.AIContext;
import com.tingshulien.game.utility.qualifier.Qualifier;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseSelector<T extends AIContext> implements Selector<T> {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    Qualifier<T> defaultQualifier;

    @Getter
    @Setter
    List<Qualifier<T>> qualifiers;

    @Override
    public void add(Qualifier<T> qualifier) {
        this.qualifiers.add(qualifier);
    }

    @Override
    public abstract Qualifier<T> select(T context);

}
