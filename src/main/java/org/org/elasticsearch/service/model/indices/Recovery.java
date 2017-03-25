package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Recovery {
  private String   current_as_source;
    private String   current_as_target;
    private String  throttle_time_in_millis;

    public String getCurrent_as_source() {
        return current_as_source;
    }

    public void setCurrent_as_source(String current_as_source) {
        this.current_as_source = current_as_source;
    }

    public String getCurrent_as_target() {
        return current_as_target;
    }

    public void setCurrent_as_target(String current_as_target) {
        this.current_as_target = current_as_target;
    }

    public String getThrottle_time_in_millis() {
        return throttle_time_in_millis;
    }

    public void setThrottle_time_in_millis(String throttle_time_in_millis) {
        this.throttle_time_in_millis = throttle_time_in_millis;
    }
}
