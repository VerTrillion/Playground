package com.playground.ejb;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Local
public interface PlaygroundBeanLocal {
	
	public Response helloWorld(String name);
}
