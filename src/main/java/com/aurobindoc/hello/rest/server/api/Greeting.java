package com.aurobindoc.hello.rest.server.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by aurobindo.m on 09/04/22
 **/
public class Greeting {

    private long id;
    private String greet;

    public Greeting() {
    }

    public Greeting(long id, String greet) {
        this.id = id;
        this.greet = greet;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getGreet() {
        return greet;
    }


    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", greet='" + greet + '\'' +
                '}';
    }
}