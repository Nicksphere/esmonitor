package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Percolate {
   private String  total;
    private String time_in_millis;
    private String current;
    private String  memory_size_in_bytes;
    private String   memory_size;
    private String queries;

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

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getMemory_size_in_bytes() {
        return memory_size_in_bytes;
    }

    public void setMemory_size_in_bytes(String memory_size_in_bytes) {
        this.memory_size_in_bytes = memory_size_in_bytes;
    }

    public String getMemory_size() {
        return memory_size;
    }

    public void setMemory_size(String memory_size) {
        this.memory_size = memory_size;
    }

    public String getQueries() {
        return queries;
    }

    public void setQueries(String queries) {
        this.queries = queries;
    }
}
