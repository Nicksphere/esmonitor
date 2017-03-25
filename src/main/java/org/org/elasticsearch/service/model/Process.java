package org.org.elasticsearch.service.model;

import org.org.elasticsearch.service.model.process.Cpu;
import org.org.elasticsearch.service.model.process.Mem;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Process {
    private String timestamp;
    private String open_file_descriptors;
    private String max_file_descriptors;
    private Cpu cpu;
    private Mem mem;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOpen_file_descriptors() {
        return open_file_descriptors;
    }

    public void setOpen_file_descriptors(String open_file_descriptors) {
        this.open_file_descriptors = open_file_descriptors;
    }

    public String getMax_file_descriptors() {
        return max_file_descriptors;
    }

    public void setMax_file_descriptors(String max_file_descriptors) {
        this.max_file_descriptors = max_file_descriptors;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Mem getMem() {
        return mem;
    }

    public void setMem(Mem mem) {
        this.mem = mem;
    }
}
