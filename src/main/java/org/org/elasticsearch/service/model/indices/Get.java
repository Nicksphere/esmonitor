package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Get {
   private String total;
    private String     time_in_millis;
    private String    exists_total;
    private String         exists_time_in_millis;
    private String       missing_total;
    private String       missing_time_in_millis;
    private String       current;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTime_in_millis() {
        return time_in_millis;
    }

    public void setTime_in_millis(String time_in_millis) {
        this.time_in_millis = time_in_millis;
    }

    public String getExists_total() {
        return exists_total;
    }

    public void setExists_total(String exists_total) {
        this.exists_total = exists_total;
    }

    public String getExists_time_in_millis() {
        return exists_time_in_millis;
    }

    public void setExists_time_in_millis(String exists_time_in_millis) {
        this.exists_time_in_millis = exists_time_in_millis;
    }

    public String getMissing_total() {
        return missing_total;
    }

    public void setMissing_total(String missing_total) {
        this.missing_total = missing_total;
    }

    public String getMissing_time_in_millis() {
        return missing_time_in_millis;
    }

    public void setMissing_time_in_millis(String missing_time_in_millis) {
        this.missing_time_in_millis = missing_time_in_millis;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}
