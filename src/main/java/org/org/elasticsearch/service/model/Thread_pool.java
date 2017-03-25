package org.org.elasticsearch.service.model;

import org.org.elasticsearch.service.model.thread_pool.*;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Thread_pool {
    private Bulk bulk;
    private Fetch_shard_started fetch_shard_started;
    private Fetch_shard_store fetch_shard_store;
    private Flush flush;
    private Force_merge force_merge;
    private Generic generic;
    private Get get;
    private Index index;
    private Listener listener;
    private Management management;
    private Optimize optimize;
    private Percolate percolate;
    private Refresh refresh;
    private Search search;
    private Snapshot snapshot;
    private  Suggest suggest;
    private Warmer warmer;

    public Optimize getOptimize() {
        return optimize;
    }

    public void setOptimize(Optimize optimize) {
        this.optimize = optimize;
    }

    public Bulk getBulk() {
        return bulk;
    }

    public void setBulk(Bulk bulk) {
        this.bulk = bulk;
    }

    public Fetch_shard_started getFetch_shard_started() {
        return fetch_shard_started;
    }

    public void setFetch_shard_started(Fetch_shard_started fetch_shard_started) {
        this.fetch_shard_started = fetch_shard_started;
    }

    public Fetch_shard_store getFetch_shard_store() {
        return fetch_shard_store;
    }

    public void setFetch_shard_store(Fetch_shard_store fetch_shard_store) {
        this.fetch_shard_store = fetch_shard_store;
    }

    public Flush getFlush() {
        return flush;
    }

    public void setFlush(Flush flush) {
        this.flush = flush;
    }

    public Force_merge getForce_merge() {
        return force_merge;
    }

    public void setForce_merge(Force_merge force_merge) {
        this.force_merge = force_merge;
    }

    public Generic getGeneric() {
        return generic;
    }

    public void setGeneric(Generic generic) {
        this.generic = generic;
    }

    public Get getGet() {
        return get;
    }

    public void setGet(Get get) {
        this.get = get;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public Listener getListener() {
        return listener;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }

    public Percolate getPercolate() {
        return percolate;
    }

    public void setPercolate(Percolate percolate) {
        this.percolate = percolate;
    }

    public Refresh getRefresh() {
        return refresh;
    }

    public void setRefresh(Refresh refresh) {
        this.refresh = refresh;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public Suggest getSuggest() {
        return suggest;
    }

    public void setSuggest(Suggest suggest) {
        this.suggest = suggest;
    }

    public Warmer getWarmer() {
        return warmer;
    }

    public void setWarmer(Warmer warmer) {
        this.warmer = warmer;
    }
}
