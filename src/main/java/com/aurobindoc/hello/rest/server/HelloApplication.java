package com.aurobindoc.hello.rest.server;

import com.aurobindoc.hello.rest.server.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by aurobindo.m on 09/04/22
 **/
public class HelloApplication extends Application<HelloConfiguration> {

    @Override
    public void run(HelloConfiguration helloConfiguration, Environment environment) throws Exception {
        environment.jersey().register(
                new HelloResource(helloConfiguration.getTemplate(), helloConfiguration.getDefaultName())
        );
    }

    public static void main(String[] args) throws Exception {
        new HelloApplication().run(args);
    }
}
