/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author u6390869
 */
@Path("Creche")
public class CrecheWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CrecheWS
     */
    public CrecheWS() {
    }

    /**
     * Retrieves representation of an instance of ws.CrecheWS
     * @return an instance of java.lang.String
     */
    @GET
    
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/teste")
    public String getJson() {
        //TODO return proper representation object
        return "Teste";
    }

    /**
     * PUT method for updating or creating an instance of CrecheWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
