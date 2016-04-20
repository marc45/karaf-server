package cn.com.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2016/4/20.
 */
@Path("/")
public interface HelloService {

    @Path("/world")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    String hello();

    @Path("/{name}")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    String hi(@PathParam("name") String name);
}
