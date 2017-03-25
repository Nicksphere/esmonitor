package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Query_cache {
   private String memory_size_in_bytes;
    private String total_count;
    private String hit_count;
    private String miss_count;
    private String cache_size;
    private String cache_count;
    private String evictions;

    public String getMemory_size_in_bytes() {
        return memory_size_in_bytes;
    }

    public void setMemory_size_in_bytes(String memory_size_in_bytes) {
        this.memory_size_in_bytes = memory_size_in_bytes;
    }

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
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

    public String getCache_size() {
        return cache_size;
    }

    public void setCache_size(String cache_size) {
        this.cache_size = cache_size;
    }

    public String getCache_count() {
        return cache_count;
    }

    public void setCache_count(String cache_count) {
        this.cache_count = cache_count;
    }

    public String getEvictions() {
        return evictions;
    }

    public void setEvictions(String evictions) {
        this.evictions = evictions;
    }
}
