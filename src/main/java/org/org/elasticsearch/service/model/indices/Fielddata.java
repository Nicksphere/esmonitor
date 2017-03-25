package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Fielddata {
    private String memory_size_in_bytes;
    private String evictions;

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
}
