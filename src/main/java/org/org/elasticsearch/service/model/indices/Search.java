package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Search {
    private String open_contexts;
    private String   query_total;
    private String   query_time_in_millis;
    private String  query_current;
    private String  fetch_total;
    private String  fetch_time_in_millis;
    private String  fetch_current;
    private String  scroll_total;
    private String   scroll_time_in_millis;
    private String  scroll_current;

    public String getOpen_contexts() {
        return open_contexts;
    }

    public void setOpen_contexts(String open_contexts) {
        this.open_contexts = open_contexts;
    }

    public String getQuery_total() {
        return query_total;
    }

    public void setQuery_total(String query_total) {
        this.query_total = query_total;
    }

    public String getQuery_time_in_millis() {
        return query_time_in_millis;
    }

    public void setQuery_time_in_millis(String query_time_in_millis) {
        this.query_time_in_millis = query_time_in_millis;
    }

    public String getQuery_current() {
        return query_current;
    }

    public void setQuery_current(String query_current) {
        this.query_current = query_current;
    }

    public String getFetch_total() {
        return fetch_total;
    }

    public void setFetch_total(String fetch_total) {
        this.fetch_total = fetch_total;
    }

    public String getFetch_time_in_millis() {
        return fetch_time_in_millis;
    }

    public void setFetch_time_in_millis(String fetch_time_in_millis) {
        this.fetch_time_in_millis = fetch_time_in_millis;
    }

    public String getFetch_current() {
        return fetch_current;
    }

    public void setFetch_current(String fetch_current) {
        this.fetch_current = fetch_current;
    }

    public String getScroll_total() {
        return scroll_total;
    }

    public void setScroll_total(String scroll_total) {
        this.scroll_total = scroll_total;
    }

    public String getScroll_time_in_millis() {
        return scroll_time_in_millis;
    }

    public void setScroll_time_in_millis(String scroll_time_in_millis) {
        this.scroll_time_in_millis = scroll_time_in_millis;
    }

    public String getScroll_current() {
        return scroll_current;
    }

    public void setScroll_current(String scroll_current) {
        this.scroll_current = scroll_current;
    }
}
