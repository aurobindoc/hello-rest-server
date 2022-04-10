package com.aurobindoc.hello.rest.server;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

/**
 * Created by aurobindo.m on 09/04/22
 **/
public class HelloConfiguration extends Configuration {

    @NotNull
    private String template;

    @NotNull
    private String defaultName = "Aurobindo";

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }


}
