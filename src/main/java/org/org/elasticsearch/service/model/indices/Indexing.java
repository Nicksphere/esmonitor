package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Indexing {
    private String index_total;
     private String   index_time_in_millis;
      private String   index_current;
       private String     index_failed;
    private String  delete_total;
    private String       delete_time_in_millis;
    private String   delete_current;
    private String    noop_update_total;
    private String     is_throttled;
    private String     throttle_time_in_millis;

    public String getIndex_total() {
        return index_total;
    }

    public void setIndex_total(String index_total) {
        this.index_total = index_total;
    }

    public String getIndex_time_in_millis() {
        return index_time_in_millis;
    }

    public void setIndex_time_in_millis(String index_time_in_millis) {
        this.index_time_in_millis = index_time_in_millis;
    }

    public String getIndex_current() {
        return index_current;
    }

    public void setIndex_current(String index_current) {
        this.index_current = index_current;
    }

    public String getIndex_failed() {
        return index_failed;
    }

    public void setIndex_failed(String index_failed) {
        this.index_failed = index_failed;
    }

    public String getDelete_total() {
        return delete_total;
    }

    public void setDelete_total(String delete_total) {
        this.delete_total = delete_total;
    }

    public String getDelete_time_in_millis() {
        return delete_time_in_millis;
    }

    public void setDelete_time_in_millis(String delete_time_in_millis) {
        this.delete_time_in_millis = delete_time_in_millis;
    }

    public String getDelete_current() {
        return delete_current;
    }

    public void setDelete_current(String delete_current) {
        this.delete_current = delete_current;
    }

    public String getNoop_update_total() {
        return noop_update_total;
    }

    public void setNoop_update_total(String noop_update_total) {
        this.noop_update_total = noop_update_total;
    }

    public String getIs_throttled() {
        return is_throttled;
    }

    public void setIs_throttled(String is_throttled) {
        this.is_throttled = is_throttled;
    }

    public String getThrottle_time_in_millis() {
        return throttle_time_in_millis;
    }

    public void setThrottle_time_in_millis(String throttle_time_in_millis) {
        this.throttle_time_in_millis = throttle_time_in_millis;
    }
}
