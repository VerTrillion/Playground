package com.playground.ejb;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Local
@Path("/greeting")
public interface PlaygroundBeanLocal {
	
	@GET
	@Path("/{param}")
	public Response helloWorld(@PathParam("param") String name);
}
