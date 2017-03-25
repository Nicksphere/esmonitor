package org.org.elasticsearch.service.model.os;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Mem {
    private String total_in_bytes;
    private String free_in_bytes;
    private String used_in_bytes;
    private String free_percent;
    private String used_percent;

    public String getTotal_in_bytes() {
        return total_in_bytes;
    }

    public void setTotal_in_bytes(String total_in_bytes) {
        this.total_in_bytes = total_in_bytes;
    }

    public String getFree_in_bytes() {
        return free_in_bytes;
    }

    public void setFree_in_bytes(String free_in_bytes) {
        this.free_in_bytes = free_in_bytes;
    }

    public String getUsed_in_bytes() {
        return used_in_bytes;
    }

    public void setUsed_in_bytes(String used_in_bytes) {
        this.used_in_bytes = used_in_bytes;
    }

    public String getFree_percent() {
        return free_percent;
    }

    public void setFree_percent(String free_percent) {
        this.free_percent = free_percent;
    }

    public String getUsed_percent() {
        return used_percent;
    }

    public void setUsed_percent(String used_percent) {
        this.used_percent = used_percent;
    }
}
