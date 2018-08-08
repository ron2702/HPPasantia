/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import comun.Empleado;
import comun.Estudiante;
import comun.Usuario;
import controlador.modulo_empleados.BorrarEmpleadoComando;
import controlador.modulo_empleados.ConsultarEmpleadoPorCedulaComando;
import controlador.modulo_empleados.ConsultarTodosEmpleadoComando;
import controlador.modulo_estudiantes.BorrarEstudianteComando;
import controlador.modulo_estudiantes.ConsultarEstudiantePorCedulaComando;
import controlador.modulo_estudiantes.ConsultarTodosEstudianteComando;
import controlador.modulo_estudiantes.ModificarEstudianteComando;
import controlador.modulo_estudiantes.RegistrarEstudianteComando;
import controlador.modulo_usuarios.InicioSesionComando;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    /*WS DE ESTUDIANTE*/
    @GET
    @Path("registroEstudiante")
    @Produces("application/json")
    public String RegistroEstudiante (@QueryParam("estudiante") String _estudiante){
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteRegistrar = gson.fromJson(_estudiante, Estudiante.class);
        RegistrarEstudianteComando cmd = new RegistrarEstudianteComando(estudianteRegistrar);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Estudiante error = new Estudiante();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    // http://localhost:8084/HenriPittierWeb/webresources/WS/modificarEstudiante?cedula=123456&primerNombre=Ronaldsito&segundoNombre=Efrainsito&primerApellido=Navasito&segundoApellido=Hernandez&fechaNac=27/02/1993&foto=nulaso
    @GET
    @Path("modificarEstudiante")
    @Produces("application/json")
    public String ModificarEstudiante (@QueryParam("estudiante") String _estudiante){
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteModificar = gson.fromJson(_estudiante, Estudiante.class);
        ModificarEstudianteComando cmd = new ModificarEstudianteComando(estudianteModificar);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Estudiante error = new Estudiante();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    
    @GET
    @Path("borrarEstudiante")
    @Produces("application/json")
    public String BorrarEstudiante (@QueryParam("estudiante") String _estudiante){
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteBorrar = gson.fromJson(_estudiante, Estudiante.class);
        BorrarEstudianteComando cmd = new BorrarEstudianteComando(estudianteBorrar);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Estudiante error = new Estudiante();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    
    @GET
    @Path("consultarEstudiantePorCedula")
    @Produces("application/json")
    public String ConsultarEstudiantePorCedula (@QueryParam("estudiante") String _estudiante){
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteConsultar = gson.fromJson(_estudiante, Estudiante.class);
        ConsultarEstudiantePorCedulaComando cmd = new ConsultarEstudiantePorCedulaComando(estudianteConsultar);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Estudiante error = new Estudiante();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    
    @GET
    @Path("consultarEstudiante")
    @Produces("application/json")
    public String ConsultarEstudiante (){
        ConsultarTodosEstudianteComando cmd = new ConsultarTodosEstudianteComando();
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Estudiante error = new Estudiante();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    
    /*WS DE EMPLEADO*/
    @GET
    @Path("borrarEmpleado")
    @Produces("application/json")
    public String BorrarEmpleado (@QueryParam("empleado") String _empleado){
        int ci = Integer.parseInt(_empleado);
        Gson gson = new GsonBuilder().create();
        Empleado empleadoBorrar = /*gson.fromJson(_empleado, Empleado.class)*/ new Empleado(ci);
        BorrarEmpleadoComando cmd = new BorrarEmpleadoComando(empleadoBorrar);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Empleado error = new Empleado();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    
    @GET
    @Path("consultarEmpleado")
    @Produces("application/json")
    public String ConsultarEmpleado (){
        ConsultarTodosEmpleadoComando cmd = new ConsultarTodosEmpleadoComando();
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Empleado error = new Empleado();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
    
    @GET
    @Path("consultarEmpleadoPorCedula")
    @Produces("application/json")
    public String ConsultarEmpleadoPorCedula (@QueryParam("empleado") String _empleado){
        Gson gson = new GsonBuilder().create();
        Empleado empleadoConsultar = gson.fromJson(_empleado, Empleado.class);
        ConsultarEmpleadoPorCedulaComando cmd = new ConsultarEmpleadoPorCedulaComando(empleadoConsultar);
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());//nuevo
        } catch (Exception ex) {
            Estudiante error = new Estudiante();
            error.setError(500);
            return gson.toJson(error);//nuevo
        }
    }
}
