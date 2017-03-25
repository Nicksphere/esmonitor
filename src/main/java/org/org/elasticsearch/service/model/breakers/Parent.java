package org.org.elasticsearch.service.model.breakers;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Parent {
   private String limit_size_in_bytes;
    private String limit_size;
    private String estimated_size_in_bytes;
    private String estimated_size;
    private String overhead;
    private String tripped;

    public String getLimit_size() {
        return limit_size;
    }

    public void setLimit_size(String limit_size) {
        this.limit_size = limit_size;
    }

    public String getLimit_size_in_bytes() {
        return limit_size_in_bytes;
    }

    public void setLimit_size_in_bytes(String limit_size_in_bytes) {
        this.limit_size_in_bytes = limit_size_in_bytes;
    }

    public String getEstimated_size_in_bytes() {
        return estimated_size_in_bytes;
    }

    public void setEstimated_size_in_bytes(String estimated_size_in_bytes) {
        this.estimated_size_in_bytes = estimated_size_in_bytes;
    }

    public String getEstimated_size() {
        return estimated_size;
    }

    public void setEstimated_size(String estimated_size) {
        this.estimated_size = estimated_size;
    }

    public String getOverhead() {
        return overhead;
    }

    public void setOverhead(String overhead) {
        this.overhead = overhead;
    }

    public String getTripped() {
        return tripped;
    }

    public void setTripped(String tripped) {
        this.tripped = tripped;
    }
}
