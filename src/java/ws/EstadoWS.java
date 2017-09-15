/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.EstadoDAO;
import java.util.List;
import javafx.scene.media.Media;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Estado;

/**
 * REST Web Service
 *
 * @author u6390869
 */
@Path("Creche")
public class EstadoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EstadoWS
     */
    public EstadoWS() {
    }

    /**
     * Retrieves representation of an instance of ws.EstadoWS
     * @return an instance of java.lang.String
     */
   
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/estados")
    public String getEstados(){
        Gson g = new Gson();
        
        EstadoDAO dao = new EstadoDAO();
        List<Estado> estados = dao.listar();
        
        return g.toJson(estados);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/inserir/estados")
    public boolean inserirEstado(String content){
         Gson g = new Gson();
         Estado estado = (Estado) g.fromJson(content, Estado.class);
         
         EstadoDAO edao = new EstadoDAO();
         return edao.inserir(estado);
    }
   

    /**
     * PUT method for updating or creating an instance of EstadoWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
