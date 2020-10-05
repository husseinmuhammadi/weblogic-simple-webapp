package com.javastudio.tutorial.j2ee.web.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class HelloResource {

    @GET
    @Path("/list")
    public Response list() {
        System.out.println("List of users is going to be populated ...");
        return Response.ok().build();
    }
}
