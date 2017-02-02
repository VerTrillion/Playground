package com.playground.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.logging.Logger;
import org.jboss.resteasy.logging.impl.Log4jLogger;

import com.playground.logic.PlaygroundManager;

@Stateless
@LocalBean
@Path("/greeting")
public class PlaygroundBean implements PlaygroundBeanLocal {
	Logger logger = Log4jLogger.getLogger(PlaygroundBean.class);
	
	PlaygroundManager manager = new PlaygroundManager();
	
    public PlaygroundBean() {
        
    }

	@GET
	@Path("/name/{param}")
	public Response helloWorld(@PathParam("param") String name) {
		logger.debug("helloworld");
		logger.debug(">>name:" + name);
		String result = "Hello World " + name;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/db")
	public Response helloDB() {
		logger.debug("helloDB");
		String result = manager.getHello();
		return Response.status(200).entity(result).build();
	}
}
