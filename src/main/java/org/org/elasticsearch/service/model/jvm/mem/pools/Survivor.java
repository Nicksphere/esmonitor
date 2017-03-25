package org.org.elasticsearch.service.model.jvm.mem.pools;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Survivor {
    private String used_in_bytes;
    private String max_in_bytes;
    private String peak_used_in_bytes;
    private String peak_max_in_bytes;

    public String getUsed_in_bytes() {
        return used_in_bytes;
    }

    public void setUsed_in_bytes(String used_in_bytes) {
        this.used_in_bytes = used_in_bytes;
    }

    public String getMax_in_bytes() {
        return max_in_bytes;
    }

    public void setMax_in_bytes(String max_in_bytes) {
        this.max_in_bytes = max_in_bytes;
    }

    public String getPeak_used_in_bytes() {
        return peak_used_in_bytes;
    }

    public void setPeak_used_in_bytes(String peak_used_in_bytes) {
        this.peak_used_in_bytes = peak_used_in_bytes;
    }

    public String getPeak_max_in_bytes() {
        return peak_max_in_bytes;
    }

    public void setPeak_max_in_bytes(String peak_max_in_bytes) {
        this.peak_max_in_bytes = peak_max_in_bytes;
    }
}
