package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Suggest {
    private String total;
    private String current;
    private String time_in_millis;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getTime_in_millis() {
        return time_in_millis;
    }

    public void setTime_in_millis(String time_in_millis) {
        this.time_in_millis = time_in_millis;
    }
}
