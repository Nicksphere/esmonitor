package org.org.elasticsearch.service.model.jvm.gc.collectors;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Young {
    private String collection_count;
    private String collection_time_in_millis;

    public String getCollection_count() {
        return collection_count;
    }

    public void setCollection_count(String collection_count) {
        this.collection_count = collection_count;
    }

    public String getCollection_time_in_millis() {
        return collection_time_in_millis;
    }

    public void setCollection_time_in_millis(String collection_time_in_millis) {
        this.collection_time_in_millis = collection_time_in_millis;
    }
}
