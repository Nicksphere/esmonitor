package org.org.elasticsearch.service.model;

import org.org.elasticsearch.service.model.indices.*;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Indices {
    private Docs docs;
    private Store store;
    private Indexing indexing;
    private Get get;
    private Search search;
    private Merges merges;
    private Refresh refresh;
    private Flush flush;
    private Warmer warmer;
    private Query_cache query_cache;
    private Fielddata fielddata;
    private Percolate percolate;
    private Completion completion;
    private Segments segments;
    private Translog translog;
    private Suggest suggest;
    private Request_cache request_cache;
    private Recovery recovery;

    public Docs getDocs() {
        return docs;
    }

    public void setDocs(Docs docs) {
        this.docs = docs;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Indexing getIndexing() {
        return indexing;
    }

    public void setIndexing(Indexing indexing) {
        this.indexing = indexing;
    }

    public Get getGet() {
        return get;
    }

    public void setGet(Get get) {
        this.get = get;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Merges getMerges() {
        return merges;
    }

    public void setMerges(Merges merges) {
        this.merges = merges;
    }

    public Refresh getRefresh() {
        return refresh;
    }

    public void setRefresh(Refresh refresh) {
        this.refresh = refresh;
    }

    public Flush getFlush() {
        return flush;
    }

    public void setFlush(Flush flush) {
        this.flush = flush;
    }

    public Warmer getWarmer() {
        return warmer;
    }

    public void setWarmer(Warmer warmer) {
        this.warmer = warmer;
    }

    public Query_cache getQuery_cache() {
        return query_cache;
    }

    public void setQuery_cache(Query_cache query_cache) {
        this.query_cache = query_cache;
    }

    public Fielddata getFielddata() {
        return fielddata;
    }

    public void setFielddata(Fielddata fielddata) {
        this.fielddata = fielddata;
    }

    public Percolate getPercolate() {
        return percolate;
    }

    public void setPercolate(Percolate percolate) {
        this.percolate = percolate;
    }

    public Completion getCompletion() {
        return completion;
    }

    public void setCompletion(Completion completion) {
        this.completion = completion;
    }

    public Segments getSegments() {
        return segments;
    }

    public void setSegments(Segments segments) {
        this.segments = segments;
    }

    public Translog getTranslog() {
        return translog;
    }

    public void setTranslog(Translog translog) {
        this.translog = translog;
    }

    public Suggest getSuggest() {
        return suggest;
    }

    public void setSuggest(Suggest suggest) {
        this.suggest = suggest;
    }

    public Request_cache getRequest_cache() {
        return request_cache;
    }

    public void setRequest_cache(Request_cache request_cache) {
        this.request_cache = request_cache;
    }

    public Recovery getRecovery() {
        return recovery;
    }

    public void setRecovery(Recovery recovery) {
        this.recovery = recovery;
    }
}
