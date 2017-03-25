package org.org.elasticsearch.service.model.jvm;

import org.org.elasticsearch.service.model.jvm.mem.Pools;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Mem {
    private String heap_used_in_bytes;
    private String heap_used_percent;
    private String heap_committed_in_bytes;
    private String heap_max_in_bytes;
    private String non_heap_used_in_bytes;
    private String non_heap_committed_in_bytes;
    private Pools pools;

    public String getHeap_used_in_bytes() {
        return heap_used_in_bytes;
    }

    public void setHeap_used_in_bytes(String heap_used_in_bytes) {
        this.heap_used_in_bytes = heap_used_in_bytes;
    }

    public String getHeap_used_percent() {
        return heap_used_percent;
    }

    public void setHeap_used_percent(String heap_used_percent) {
        this.heap_used_percent = heap_used_percent;
    }

    public String getHeap_committed_in_bytes() {
        return heap_committed_in_bytes;
    }

    public void setHeap_committed_in_bytes(String heap_committed_in_bytes) {
        this.heap_committed_in_bytes = heap_committed_in_bytes;
    }

    public String getHeap_max_in_bytes() {
        return heap_max_in_bytes;
    }

    public void setHeap_max_in_bytes(String heap_max_in_bytes) {
        this.heap_max_in_bytes = heap_max_in_bytes;
    }

    public String getNon_heap_used_in_bytes() {
        return non_heap_used_in_bytes;
    }

    public void setNon_heap_used_in_bytes(String non_heap_used_in_bytes) {
        this.non_heap_used_in_bytes = non_heap_used_in_bytes;
    }

    public String getNon_heap_committed_in_bytes() {
        return non_heap_committed_in_bytes;
    }

    public void setNon_heap_committed_in_bytes(String non_heap_committed_in_bytes) {
        this.non_heap_committed_in_bytes = non_heap_committed_in_bytes;
    }

    public Pools getPools() {
        return pools;
    }

    public void setPools(Pools pools) {
        this.pools = pools;
    }
}
