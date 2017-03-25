package org.org.elasticsearch.service.model;

import org.org.elasticsearch.service.model.breakers.Fielddata;
import org.org.elasticsearch.service.model.breakers.Parent;
import org.org.elasticsearch.service.model.breakers.Request;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Breakers {
    private Request request;
    private Fielddata fielddata;
    private Parent parent;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Fielddata getFielddata() {
        return fielddata;
    }

    public void setFielddata(Fielddata fielddata) {
        this.fielddata = fielddata;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
