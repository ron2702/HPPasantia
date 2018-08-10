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
import controlador.modulo_empleados.ConsultarEmpleadoDetalleComando;
import controlador.modulo_empleados.ConsultarEmpleadosComando;
import controlador.modulo_empleados.ModificarEmpleadoComando;
import controlador.modulo_empleados.RegistrarEmpleadoComando;
import controlador.modulo_estudiantes.BorrarEstudianteComando;
import controlador.modulo_estudiantes.ConsultarEstudianteDetalleComando;
import controlador.modulo_estudiantes.ConsultarEstudiantesComando;
import controlador.modulo_estudiantes.ModificarEstudianteComando;
import controlador.modulo_estudiantes.RegistrarEstudianteComando;
import controlador.modulo_usuarios.InicioSesionComando;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import static modelo.Registry.RESULTADO_CODIGO_FALLIDO;


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
    @Path("inicioSesionUsuario")
    @Produces("application/json")
    public String iniciarSesion (@QueryParam("usuario") String _usuario){
        Gson gson = new GsonBuilder().create();
        Usuario usuarioLogin = gson.fromJson(_usuario, Usuario.class);
        InicioSesionComando cmd = new InicioSesionComando(usuarioLogin);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Usuario error = new Usuario();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE ESTUDIANTE*/
    @GET
    @Path("registrarEstudiante")
    @Produces("application/json")
    
    public String registrarEstudiante (@QueryParam("estudiante") String _estudiante){
        
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteRegistrar = gson.fromJson(_estudiante, Estudiante.class);
        RegistrarEstudianteComando cmd = new RegistrarEstudianteComando(estudianteRegistrar);
        
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Estudiante error = new Estudiante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    // http://localhost:8084/HenriPittierWeb/webresources/WS/modificarEstudiante?cedula=123456&primerNombre=Ronaldsito&segundoNombre=Efrainsito&primerApellido=Navasito&segundoApellido=Hernandez&fechaNac=27/02/1993&foto=nulaso
    @GET
    @Path("modificarEstudiante")
    @Produces("application/json")
    public String modificarEstudiante (@QueryParam("estudiante") String _estudiante){
        
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteModificar = gson.fromJson(_estudiante, Estudiante.class);
        ModificarEstudianteComando cmd = new ModificarEstudianteComando(estudianteModificar);
        
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Estudiante error = new Estudiante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarEstudiante")
    @Produces("application/json")
    public String borrarEstudiante (@QueryParam("estudiante") String _estudiante){
        
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteBorrar = gson.fromJson(_estudiante, Estudiante.class);
        BorrarEstudianteComando cmd = new BorrarEstudianteComando(estudianteBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Estudiante error = new Estudiante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarEstudianteDetalle")
    @Produces("application/json")
    public String consultarEstudianteDetalle (@QueryParam("estudiante") String _estudiante){
        
        Gson gson = new GsonBuilder().create();
        Estudiante estudianteConsultar = gson.fromJson(_estudiante, Estudiante.class);
        ConsultarEstudianteDetalleComando cmd = new ConsultarEstudianteDetalleComando(estudianteConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Estudiante error = new Estudiante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarEstudiantes")
    @Produces("application/json")
    public String consultarEstudiantes (){
        ConsultarEstudiantesComando cmd = new ConsultarEstudiantesComando();
        
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Estudiante error = new Estudiante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE EMPLEADO*/
   @GET
    @Path("registrarEmpleado")
    @Produces("application/json")
    public String registrarEmpleado (@QueryParam("empleado") String _empleado){
        
        Gson gson = new GsonBuilder().create();
        Empleado empleadoRegistrar = gson.fromJson(_empleado, Empleado.class);
        RegistrarEmpleadoComando cmd = new RegistrarEmpleadoComando(empleadoRegistrar);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Empleado error = new Empleado();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
     @GET
    @Path("modificarEmpleado")
    @Produces("application/json")
    public String modificarEmpleado (@QueryParam("empleado") String _empleado){
        
        Gson gson = new GsonBuilder().create();
        Empleado empleadoModificar = gson.fromJson(_empleado, Empleado.class);
        ModificarEmpleadoComando cmd = new ModificarEmpleadoComando(empleadoModificar);
        
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Empleado error = new Empleado();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
     
    @GET
    @Path("borrarEmpleado")
    @Produces("application/json")
    public String borrarEmpleado (@QueryParam("empleado") String _empleado){
        
        Gson gson = new GsonBuilder().create();
        Empleado empleadoBorrar = gson.fromJson(_empleado, Empleado.class);
        BorrarEmpleadoComando cmd = new BorrarEmpleadoComando(empleadoBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Empleado error = new Empleado();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarEmpleados")
    @Produces("application/json")
    public String consultarEmpleados (){
        
        ConsultarEmpleadosComando cmd = new ConsultarEmpleadosComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Empleado> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarEmpleadoDetalle")
    @Produces("application/json")
    public String consultarEmpleadoDetalle (@QueryParam("empleado") String _empleado){
        
        Gson gson = new GsonBuilder().create();
        Empleado empleadoConsultar = gson.fromJson(_empleado, Empleado.class);
        ConsultarEmpleadoDetalleComando cmd = new ConsultarEmpleadoDetalleComando(empleadoConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Empleado error = new Empleado();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
}
