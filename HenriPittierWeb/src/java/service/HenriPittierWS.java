/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import comun.Usuario;
import controlador.modulo_usuarios.InicioSesionComando;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Bárbara Fernández
 */
@Path("WS")
public class HenriPittierWS {
    Gson gson = new Gson();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HenriPittierWS
     */
    public HenriPittierWS() {
    }

    /**
     * Retrieves representation of an instance of service.HenriPittierWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of HenriPittierWS
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    @GET
    @Path("prueba")
    @Produces("application/json")
    public String ejemplo (){
        return gson.toJson("Funciona");//nuevo
    }
    
    @GET
    @Path("inicioSesionUsuario")
    @Produces("application/json")
    public String IniciarSesion (@QueryParam("usuario") String _usuario){
        Gson gson = new GsonBuilder().create();
        Usuario usuarioLogin = gson.fromJson(_usuario, Usuario.class);
        InicioSesionComando cmd = new InicioSesionComando(usuarioLogin);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Usuario error = new Usuario();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
}
