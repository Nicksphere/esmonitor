package org.org.elasticsearch.service.model;

import org.org.elasticsearch.service.model.os.Swap;
import org.org.elasticsearch.service.model.os.Mem;

/**
 * Created by 01139927 on 2016/12/6.
 */
public class Os {
    private String timestamp;
    private String cpu_percent;
    private String load_average;
    private Mem mem;
    private Swap swap;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCpu_percent() {
        return cpu_percent;
    }

    public void setCpu_percent(String cpu_percent) {
        this.cpu_percent = cpu_percent;
    }

    public String getLoad_average() {
        return load_average;
    }

    public void setLoad_average(String load_average) {
        this.load_average = load_average;
    }

    public Mem getMem() {
        return mem;
    }

    public void setMem(Mem mem) {
        this.mem = mem;
    }

    public Swap getSwap() {
        return swap;
    }

    public void setSwap(Swap swap) {
        this.swap = swap;
    }
}