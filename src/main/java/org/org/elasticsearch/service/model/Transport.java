package org.org.elasticsearch.service.model;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Transport {
    private String server_open;
    private String rx_count;
    private String rx_size_in_bytes;
    private String tx_count;
    private String tx_size_in_bytes;

    public String getServer_open() {
        return server_open;
    }

    public void setServer_open(String server_open) {
        this.server_open = server_open;
    }

    public String getRx_count() {
        return rx_count;
    }

    public void setRx_count(String rx_count) {
        this.rx_count = rx_count;
    }

    public String getRx_size_in_bytes() {
        return rx_size_in_bytes;
    }

    public void setRx_size_in_bytes(String rx_size_in_bytes) {
        this.rx_size_in_bytes = rx_size_in_bytes;
    }

    public String getTx_count() {
        return tx_count;
    }

    public void setTx_count(String tx_count) {
        this.tx_count = tx_count;
    }

    public String getTx_size_in_bytes() {
        return tx_size_in_bytes;
    }

    public void setTx_size_in_bytes(String tx_size_in_bytes) {
        this.tx_size_in_bytes = tx_size_in_bytes;
    }
}
