package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Store {
    private String size_in_bytes;
    private String throttle_time_in_millis;

    public String getSize_in_bytes() {
        return size_in_bytes;
    }

    public void setSize_in_bytes(String size_in_bytes) {
        this.size_in_bytes = size_in_bytes;
    }

    public String getThrottle_time_in_millis() {
        return throttle_time_in_millis;
    }

    public void setThrottle_time_in_millis(String throttle_time_in_millis) {
        this.throttle_time_in_millis = throttle_time_in_millis;
    }
}
