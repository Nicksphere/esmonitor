package org.org.elasticsearch.service.model;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Http {
    private String current_open;
    private String total_opened;

    public String getCurrent_open() {
        return current_open;
    }

    public void setCurrent_open(String current_open) {
        this.current_open = current_open;
    }

    public String getTotal_opened() {
        return total_opened;
    }

    public void setTotal_opened(String total_opened) {
        this.total_opened = total_opened;
    }
}
