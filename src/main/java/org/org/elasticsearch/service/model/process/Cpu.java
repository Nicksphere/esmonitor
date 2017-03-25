package org.org.elasticsearch.service.model.process;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Cpu {
    private String percent;
    private String total_in_millis;

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getTotal_in_millis() {
        return total_in_millis;
    }

    public void setTotal_in_millis(String total_in_millis) {
        this.total_in_millis = total_in_millis;
    }
}
