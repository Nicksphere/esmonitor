package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Request_cache {
    private String memory_size_in_bytes;
    private String evictions;
    private String hit_count;
    private String miss_count;

    public String getMemory_size_in_bytes() {
        return memory_size_in_bytes;
    }

    public void setMemory_size_in_bytes(String memory_size_in_bytes) {
        this.memory_size_in_bytes = memory_size_in_bytes;
    }

    public String getEvictions() {
        return evictions;
    }

    public void setEvictions(String evictions) {
        this.evictions = evictions;
    }

    public String getHit_count() {
        return hit_count;
    }

    public void setHit_count(String hit_count) {
        this.hit_count = hit_count;
    }

    public String getMiss_count() {
        return miss_count;
    }

    public void setMiss_count(String miss_count) {
        this.miss_count = miss_count;
    }
}
