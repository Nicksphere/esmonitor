package org.org.elasticsearch.service.model.jvm.mem; /**
 * Created by 01139927 on 2016/12/6.
 */
import org.org.elasticsearch.service.model.jvm.mem.pools.Old;
import org.org.elasticsearch.service.model.jvm.mem.pools.Survivor;
import org.org.elasticsearch.service.model.jvm.mem.pools.Young;

public class Pools {
    private Young young;
    private Survivor survivor;
    private Old old;

    public Young getYoung() {
        return young;
    }

    public void setYoung(Young young) {
        this.young = young;
    }

    public Survivor getSurvivor() {
        return survivor;
    }

    public void setSurvivor(Survivor survivor) {
        this.survivor = survivor;
    }

    public Old getOld() {
        return old;
    }

    public void setOld(Old old) {
        this.old = old;
    }
}
