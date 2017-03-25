package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Translog {
    private String operations;
    private String size_in_bytes;

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    public String getSize_in_bytes() {
        return size_in_bytes;
    }

    public void setSize_in_bytes(String size_in_bytes) {
        this.size_in_bytes = size_in_bytes;
    }
}
