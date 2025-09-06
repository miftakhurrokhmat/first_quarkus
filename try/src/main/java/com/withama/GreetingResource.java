package com.withama;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HttpMethod;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Retention(RetentionPolicy.RUNTIME)
@HttpMethod("NOMPO")
@interface NOMPO {
}

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @NOMPO
    @Path("/monggo")
    @Produces(MediaType.TEXT_PLAIN)
    public String monggo() {
        return "Sugeng rawuh";
    }
}
