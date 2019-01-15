package org.openshift;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.logging.Logger;

@RequestScoped
@Path("/insult")
public class InsultResource {
    private static final Logger LOGGER = Logger.getLogger(org.openshift.InsultResource.class.getName());


    @GET()
    @Produces("application/json")
    public HashMap<String, String> getInsult() {
        LOGGER.info("get called. ");
        HashMap<String, String> theInsult = new HashMap<String, String>();
        theInsult.put("insult", new InsultGenerator().generateInsult());
        return theInsult;
    }
}
