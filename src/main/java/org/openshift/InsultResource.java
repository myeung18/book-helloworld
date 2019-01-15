package org.openshift;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.HashMap;

public class InsultResource {
    @GET()
    @Produces("application/json")
    public HashMap<String, String> getInsult() {
        HashMap<String, String> theInsult = new HashMap<String, String>();
        theInsult.put("insult", new InsultGenerator().generateInsult());
        return theInsult;
    }
}
