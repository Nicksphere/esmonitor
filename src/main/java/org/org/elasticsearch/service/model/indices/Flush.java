package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Flush {
    private String total;
    private String total_time_in_millis;

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
}
