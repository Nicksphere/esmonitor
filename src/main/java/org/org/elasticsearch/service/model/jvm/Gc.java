package org.org.elasticsearch.service.model.jvm;

import org.org.elasticsearch.service.model.jvm.gc.Collectors;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Gc {
    private Collectors collectors;

    public Collectors getCollectors() {
        return collectors;
    }

    public void setCollectors(Collectors collectors) {
        this.collectors = collectors;
    }
}
