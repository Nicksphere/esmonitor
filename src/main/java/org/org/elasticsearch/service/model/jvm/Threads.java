package org.org.elasticsearch.service.model.jvm;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Threads {
    private String count;
    private String peak_count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPeak_count() {
        return peak_count;
    }

    public void setPeak_count(String peak_count) {
        this.peak_count = peak_count;
    }
}
