package com.aurobindoc.hello.rest.server.resources;

import com.aurobindoc.hello.rest.server.api.Greeting;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by aurobindo.m on 10/04/22
 **/
@Path("/")
@Produces(APPLICATION_JSON)
public class HelloResource {

    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Greeting greet(@QueryParam("name") Optional<String> name) {
        final String content = String.format(template, name.orElse(defaultName));
        return new Greeting(counter.incrementAndGet(), content);
    }
}
