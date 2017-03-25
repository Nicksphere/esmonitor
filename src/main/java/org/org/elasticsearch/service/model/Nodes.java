package org.org.elasticsearch.service.model;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Nodes {
    private Long timestamp;
    private String name;
    private String transport_address;
    private String host;
    private String ip;
    private Attributes attributes;
    private Indices indices;
    private Process process;
    private Os os;
    private Transport transport;
//    private Http http;
    private Script script;
    private Breakers breakers;
private Thread_pool thread_pool;
private Jvm jvm;

    public Jvm getJvm() {
        return jvm;
    }

    public void setJvm(Jvm jvm) {
        this.jvm = jvm;
    }

    public Thread_pool getThread_pool() {
        return thread_pool;
    }

    public void setThread_pool(Thread_pool thread_pool) {
        this.thread_pool = thread_pool;
    }

    public Breakers getBreakers() {
        return breakers;
    }

    public void setBreakers(Breakers breakers) {
        this.breakers = breakers;
    }

    public Script getScript() {
        return script;
    }

    public void setScript(Script script) {
        this.script = script;
    }

    public Transport getTransport() {
        return transport;
    }

//    public Http getHttp() {
//        return http;
//    }
//
//    public void setHttp(Http http) {
//        this.http = http;
//    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Os getOs() {
        return os;
    }
    public void setOs(Os os) {
        this.os = os;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Indices getIndices() {
        return indices;
    }

    public void setIndices(Indices indices) {
        this.indices = indices;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransport_address() {
        return transport_address;
    }

    public void setTransport_address(String transport_address) {
        this.transport_address = transport_address;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
