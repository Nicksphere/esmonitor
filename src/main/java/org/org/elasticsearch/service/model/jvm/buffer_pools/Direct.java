package org.org.elasticsearch.service.model.jvm.buffer_pools;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Direct {
    private String count;
    private String used_in_bytes;
    private String total_capacity_in_bytes;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getUsed_in_bytes() {
        return used_in_bytes;
    }

    public void setUsed_in_bytes(String used_in_bytes) {
        this.used_in_bytes = used_in_bytes;
    }

    public String getTotal_capacity_in_bytes() {
        return total_capacity_in_bytes;
    }

    public void setTotal_capacity_in_bytes(String total_capacity_in_bytes) {
        this.total_capacity_in_bytes = total_capacity_in_bytes;
    }
}
