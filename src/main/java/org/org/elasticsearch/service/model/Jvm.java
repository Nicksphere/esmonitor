package org.org.elasticsearch.service.model;

import org.org.elasticsearch.service.model.jvm.Buffer_pools;
import org.org.elasticsearch.service.model.jvm.Gc;
import org.org.elasticsearch.service.model.jvm.Mem;
import org.org.elasticsearch.service.model.jvm.Threads;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Jvm {
    private String timestamp;
    private String uptime_in_millis;
    private Mem mem;
    private Threads threads;
    private Gc gc;
    private Buffer_pools buffer_pools;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUptime_in_millis() {
        return uptime_in_millis;
    }

    public void setUptime_in_millis(String uptime_in_millis) {
        this.uptime_in_millis = uptime_in_millis;
    }

    public Mem getMem() {
        return mem;
    }

    public void setMem(Mem mem) {
        this.mem = mem;
    }

    public Threads getThreads() {
        return threads;
    }

    public void setThreads(Threads threads) {
        this.threads = threads;
    }

    public Gc getGc() {
        return gc;
    }

    public void setGc(Gc gc) {
        this.gc = gc;
    }

    public Buffer_pools getBuffer_pools() {
        return buffer_pools;
    }

    public void setBuffer_pools(Buffer_pools buffer_pools) {
        this.buffer_pools = buffer_pools;
    }
}
