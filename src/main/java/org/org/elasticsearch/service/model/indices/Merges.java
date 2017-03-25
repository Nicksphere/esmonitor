package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Merges {
    private String current;
    private String   current_docs;
    private String  current_size_in_bytes;
    private String total;
    private String total_time_in_millis;
    private String total_docs;
    private String  total_size_in_bytes;
    private String total_stopped_time_in_millis;
    private String total_throttled_time_in_millis;
    private String total_auto_throttle_in_bytes;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getCurrent_docs() {
        return current_docs;
    }

    public void setCurrent_docs(String current_docs) {
        this.current_docs = current_docs;
    }

    public String getCurrent_size_in_bytes() {
        return current_size_in_bytes;
    }

    public void setCurrent_size_in_bytes(String current_size_in_bytes) {
        this.current_size_in_bytes = current_size_in_bytes;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_time_in_millis() {
        return total_time_in_millis;
    }

    public void setTotal_time_in_millis(String total_time_in_millis) {
        this.total_time_in_millis = total_time_in_millis;
    }

    public String getTotal_docs() {
        return total_docs;
    }

    public void setTotal_docs(String total_docs) {
        this.total_docs = total_docs;
    }

    public String getTotal_size_in_bytes() {
        return total_size_in_bytes;
    }

    public void setTotal_size_in_bytes(String total_size_in_bytes) {
        this.total_size_in_bytes = total_size_in_bytes;
    }

    public String getTotal_stopped_time_in_millis() {
        return total_stopped_time_in_millis;
    }

    public void setTotal_stopped_time_in_millis(String total_stopped_time_in_millis) {
        this.total_stopped_time_in_millis = total_stopped_time_in_millis;
    }

    public String getTotal_throttled_time_in_millis() {
        return total_throttled_time_in_millis;
    }

    public void setTotal_throttled_time_in_millis(String total_throttled_time_in_millis) {
        this.total_throttled_time_in_millis = total_throttled_time_in_millis;
    }

    public String getTotal_auto_throttle_in_bytes() {
        return total_auto_throttle_in_bytes;
    }

    public void setTotal_auto_throttle_in_bytes(String total_auto_throttle_in_bytes) {
        this.total_auto_throttle_in_bytes = total_auto_throttle_in_bytes;
    }
}
