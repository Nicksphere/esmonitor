package org.org.elasticsearch.service.model.jvm;

import org.org.elasticsearch.service.model.jvm.buffer_pools.Direct;
import org.org.elasticsearch.service.model.jvm.buffer_pools.Mapped;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Buffer_pools {
    private Direct direct;
    private Mapped mapped;

    public Direct getDirect() {
        return direct;
    }

    public void setDirect(Direct direct) {
        this.direct = direct;
    }

    public Mapped getMapped() {
        return mapped;
    }

    public void setMapped(Mapped mapped) {
        this.mapped = mapped;
    }
}
