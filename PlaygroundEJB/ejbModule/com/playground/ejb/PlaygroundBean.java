package com.playground.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.logging.Logger;
import org.jboss.resteasy.logging.impl.Log4jLogger;

/**
 * Session Bean implementation class PlaygroundBean
 */
@Stateless
@LocalBean
public class PlaygroundBean implements PlaygroundBeanLocal {
	Logger logger = Log4jLogger.getLogger(PlaygroundBean.class);
	
    /**
     * Default constructor. 
     */
    public PlaygroundBean() {
        
    }

	@Override
	public Response helloWorld(String name) {
		logger.debug(">>helloworld - name:" + name);
		String result = "Hello World " + name;
		return Response.status(200).entity(result).build();
	}
}
