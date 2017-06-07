package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/tototo")
public class Tototo {
	
	@GET()
	@Produces("application/json")
	public String getInsult() {
		return "toto" + System.getenv("TEST");
	}
}