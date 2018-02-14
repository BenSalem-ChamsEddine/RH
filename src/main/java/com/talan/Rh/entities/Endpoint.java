package com.talan.Rh.entities;

public class Endpoint{
    private String name;
    private String url;
    private String method;
    private String consume;
    private String produce;

    public Endpoint(String name, String url, String method, String consume, String produce) {
        this.name = name;
        this.url = url;
        this.method = method;
        this.consume = consume;
        this.produce = produce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getConsume() {
        return consume;
    }

    public void setConsume(String consume) {
        this.consume = consume;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @Override
    public String toString() {
        return "Endpoint{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", consume='" + consume + '\'' +
                ", produce='" + produce + '\'' +
                '}';
    }
}
