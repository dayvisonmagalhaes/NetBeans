/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.BairroDAO;
import dao.EstadoDAO;
import dao.TurmaDAO;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import modelo.Bairro;
import modelo.Estado;
import modelo.Turma;

/**
 * REST Web Service
 *
 * @author u6390869
 */
@Path("Creches")
public class CrechesWs {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CrechesWs
     */
    public CrechesWs() {
    }

    /**
     * Retrieves representation of an instance of ws.CrechesWs
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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Estado/buscar/{id}")
    public String getEstadosId(@PathParam("id") int id) {
        Gson g = new Gson();
        EstadoDAO dao = new EstadoDAO();
        Estado estado = dao.buscar(id);
        return g.toJson(estado);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Estado/inserir")
    public boolean inserirEstado(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Estado estado = (Estado) g.fromJson(content, Estado.class);
        EstadoDAO dao = new EstadoDAO();
        return dao.inserir(estado);
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
        EstadoDAO dao = new EstadoDAO();
        return dao.atualizar(estado);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Bairro/inserir")
    public boolean inserirBairro(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Bairro bairro = (Bairro) g.fromJson(content, Bairro.class);
        BairroDAO dao = new BairroDAO();
        return dao.inserir(bairro);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Bairro/listar")
    public String getBairros() {
        Gson g = new Gson();
        BairroDAO dao = new BairroDAO();
        List<Bairro> bairros = dao.listar();
        return g.toJson(bairros);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Bairro/buscar/{id}")
    public String getBairroId(@PathParam("id") int id) {
        Gson g = new Gson();
        BairroDAO dao = new BairroDAO();
        Bairro bairro = dao.buscar(id);
        return g.toJson(bairro);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Bairro/deletar/{id}")
    public String deletarBairro(@PathParam("id") int id) {
        BairroDAO dao = new BairroDAO();
        if (dao.excluir(id)) {
            return "true";
        } else {
            return "false";
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Bairro/atualizar")
    public boolean atualizarBairro(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Bairro bairro = (Bairro) g.fromJson(content, Bairro.class);
        BairroDAO dao = new BairroDAO();
        return dao.atualizar(bairro);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Turma/inserir")
    public boolean inserirTurma(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Turma turma = (Turma) g.fromJson(content, Turma.class);
        TurmaDAO dao = new TurmaDAO();
        return dao.inserir(turma);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Turma/listar")
    public String getTurma() {
        Gson g = new Gson();
        TurmaDAO dao = new TurmaDAO();
        List<Turma> turmas = dao.listar();
        return g.toJson(turmas);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Turma/buscar/{id}")
    public String getTurmaId(@PathParam("id") int id) {
        Gson g = new Gson();
        TurmaDAO dao = new TurmaDAO();
        Turma turma = dao.buscar(id);
        return g.toJson(turma);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Turma/deletar/{id}")
    public String deletarTurma(@PathParam("id") int id) {
        TurmaDAO dao = new TurmaDAO();
        if (dao.excluir(id)) {
            return "true";
        } else {
            return "false";
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("Turma/atualizar")
    public boolean atualizarTurma(String content) {
        Gson g = new Gson();
        /*Os dados do json precisam ser iguais aos das classes do Java */
        Turma turma = (Turma) g.fromJson(content, Turma.class);
        TurmaDAO dao = new TurmaDAO();
        return dao.atualizar(turma);
    }

    /**
     * PUT method for updating or creating an instance of CrechesWs
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
