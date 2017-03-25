package org.org.elasticsearch.service.model.jvm.gc;

import org.org.elasticsearch.service.model.jvm.gc.collectors.Old;
import org.org.elasticsearch.service.model.jvm.gc.collectors.Young;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Collectors {
    private Young young;
    private Old old;

    public Young getYoung() {
        return young;
    }

    public void setYoung(Young young) {
        this.young = young;
    }

    public Old getOld() {
        return old;
    }

    public void setOld(Old old) {
        this.old = old;
    }
}
