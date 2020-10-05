package com.javastudio.tutorial.j2ee.web.api;

import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class HelloResource {

    @Inject
    Logger logger;

    @GET
    @Path("/list")
    public Response list() {
        logger.info("List of users is going to be populated ...");
        return Response.ok().build();
    }
}
