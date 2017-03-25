package org.org.elasticsearch.service.model;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Script {
    private String compilations;
    private String cache_evictions;

    public String getCompilations() {
        return compilations;
    }

    public void setCompilations(String compilations) {
        this.compilations = compilations;
    }

    public String getCache_evictions() {
        return cache_evictions;
    }

    public void setCache_evictions(String cache_evictions) {
        this.cache_evictions = cache_evictions;
    }
}
