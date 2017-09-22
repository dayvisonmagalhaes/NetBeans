/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.BairroDAO;
import dao.EstadoDAO;
import java.util.List;
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
import modelo.Bairro;
import modelo.Estado;

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
     *
     * @return an instance of java.lang.String
     */
   

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Estado/listar")
    public String getEstados() {
        Gson g = new Gson();
        EstadoDAO dao = new EstadoDAO();
        List<Estado> estados = dao.listar();
        return g.toJson(estados);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Estado/inserir")
    public boolean inserirEstado(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Estado estado = (Estado) g.fromJson(content, Estado.class);
        EstadoDAO edao = new EstadoDAO();
        return edao.inserir(estado);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Estado/deletar/{id}")
    public String deletarEstado(@PathParam("id") int id) {
        EstadoDAO edao = new EstadoDAO();
        if (edao.excluir(id)) {
            return "true";
        } else {
            return "false";
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Estado/atualizar")
    public boolean atualizarEstado(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Estado estado = (Estado) g.fromJson(content, Estado.class);
        EstadoDAO edao = new EstadoDAO();
        return edao.atualizar(estado);
    }

    /*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Bairro/inserir")
    public boolean inserirBairro(String content) {
        Gson g = new Gson();
        Bairro bairro = (Bairro) g.fromJson(content, Bairro.class);
        BairroDAO edao = new BairroDAO();
        return edao.inserir(bairro);
    }
*/
}
