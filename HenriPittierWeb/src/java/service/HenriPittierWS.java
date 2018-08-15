/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import comun.Emp_Gru_Est;
import comun.Empleado;
import comun.Estudiante;
import comun.Grupo;
import comun.REPEST;
import comun.Representante;
import comun.Usuario;
import controlador.modulo_emp_gru_est.RegistrarEmpGruEstComando;
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
import controlador.modulo_grupos.BorrarGrupoComando;
import controlador.modulo_grupos.ConsultarGrupoComando;
import controlador.modulo_grupos.ConsultarGrupoDetalleComando;
import controlador.modulo_grupos.ModificarGrupoComando;
import controlador.modulo_grupos.RegistrarGrupoComando;
import controlador.modulo_repest.BorrarRepEstComando;
import controlador.modulo_repest.ConsultarRepEstComando;
import controlador.modulo_repest.ConsultarRepEstDetalleComando;
import controlador.modulo_repest.RegistrarRepEstComando;
import controlador.modulo_representantes.BorrarRepresentanteComando;
import controlador.modulo_representantes.ConsultarRepresentanteDetalleComando;
import controlador.modulo_representantes.ConsultarRepresentantesComando;
import controlador.modulo_representantes.ModificarRepresentanteComando;
import controlador.modulo_representantes.RegistrarRepresentanteComando;
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
    
    /*WS DE REPRESENTANTE*/
    
    @GET
    @Path("registrarRepresentante")
    @Produces("application/json")
    public String registrarRepresentante (@QueryParam("representante") String _representante){
        
        Gson gson = new GsonBuilder().create();
        Representante representanteRegistrar = gson.fromJson(_representante, Representante.class);
        RegistrarRepresentanteComando cmd = new RegistrarRepresentanteComando(representanteRegistrar);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Representante error = new Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("modificarRepresentante")
    @Produces("application/json")
    public String modificarRepresentante (@QueryParam("representante") String _representante){
        
        Gson gson = new GsonBuilder().create();
        Representante representanteModificar = gson.fromJson(_representante, Representante.class);
        ModificarRepresentanteComando cmd = new ModificarRepresentanteComando(representanteModificar);
        
        try {
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Representante error = new Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarRepresentante")
    @Produces("application/json")
    public String borrarRepresentante (@QueryParam("representante") String _representante){
        
        Gson gson = new GsonBuilder().create();
        Representante representanteBorrar = gson.fromJson(_representante, Representante.class);
        BorrarRepresentanteComando cmd = new BorrarRepresentanteComando(representanteBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Representante error = new Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarRepresentantes")
    @Produces("application/json")
    public String consultarRepresentantes (){
        
        ConsultarRepresentantesComando cmd = new ConsultarRepresentantesComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Representante> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarRepresentanteDetalle")
    @Produces("application/json")
    public String consultarRepresentanteDetalle (@QueryParam("representante") String _representante){
        
        Gson gson = new GsonBuilder().create();
        Representante representanteConsultar = gson.fromJson(_representante, Representante.class);
        ConsultarRepresentanteDetalleComando cmd = new ConsultarRepresentanteDetalleComando(representanteConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Representante error = new Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE REPEST*/
    @GET
    @Path("registrarREPEST")
    @Produces("application/json")
    public String registrarREPEST (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        REPEST registrarRepest = gson.fromJson(_repest, REPEST.class);
        RegistrarRepEstComando cmd = new RegistrarRepEstComando(registrarRepest);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            REPEST error = new REPEST();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarREPEST")
    @Produces("application/json")
    public String borrarREPEST (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        REPEST repestBorrar = gson.fromJson(_repest, REPEST.class);
        BorrarRepEstComando cmd = new BorrarRepEstComando(repestBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            REPEST error = new REPEST();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarREPEST")
    @Produces("application/json")
    public String consultarREPEST (){
        
        ConsultarRepEstComando cmd = new ConsultarRepEstComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<REPEST> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarREPESTDetalle")
    @Produces("application/json")
    public String consultarREPESTDetalle (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        REPEST repestConsultar = gson.fromJson(_repest, REPEST.class);
        ConsultarRepEstDetalleComando cmd = new ConsultarRepEstDetalleComando(repestConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            REPEST error = new REPEST();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE GRUPO*/
    /*@QueryParam("codigo") String _codigo, @QueryParam("nombre") String _nombre, @QueryParam("descripcion") String _descripcion, @QueryParam("capacidad") String _capacidad, @QueryParam("periodo") String _periodo*/
    @GET
    @Path("registrarGrupo")
    @Produces("application/json")
    public String registrarGrupo (@QueryParam("grupo") String _grupo){
        
        Gson gson = new GsonBuilder().create();
        Grupo registrarGrupo = gson.fromJson(_grupo, Grupo.class);
        RegistrarGrupoComando cmd = new RegistrarGrupoComando(registrarGrupo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Grupo error = new Grupo();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("modificarGrupo")
    @Produces("application/json")
    public String modificarGrupo (@QueryParam("grupo") String _grupo){
        
        Gson gson = new GsonBuilder().create();
        Grupo modificarGrupo = gson.fromJson(_grupo, Grupo.class);
        ModificarGrupoComando cmd = new ModificarGrupoComando(modificarGrupo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Grupo error = new Grupo();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarGrupo")
    @Produces("application/json")
    public String borrarGrupo (@QueryParam("grupo") String _grupo){
        
        Gson gson = new GsonBuilder().create();
        Grupo grupoBorrar = /*gson.fromJson(_grupo, Grupo.class)*/ new Grupo(_grupo);
        BorrarGrupoComando cmd = new BorrarGrupoComando(grupoBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Grupo error = new Grupo();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarGrupo")
    @Produces("application/json")
    public String consultarGrupo (){
        
        ConsultarGrupoComando cmd = new ConsultarGrupoComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Grupo> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarGrupoDetalle")
    @Produces("application/json")
    public String consultarGrupoDetalle (@QueryParam("grupo") String _grupo){
        
        Gson gson = new GsonBuilder().create();
        Grupo grupoConsultar = gson.fromJson(_grupo, Grupo.class);
        ConsultarGrupoDetalleComando cmd = new ConsultarGrupoDetalleComando(grupoConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Grupo error = new Grupo();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE Emp_Gru_Est*/
    //@QueryParam("empgruest") String _empgruest
    @GET
    @Path("registrarEmpGruEst")
    @Produces("application/json")
    public String registrarEmpGruEst (@QueryParam("empgruest") String _empgruest){
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est registrarEmpGruEst = gson.fromJson(_empgruest, Emp_Gru_Est.class);
        RegistrarEmpGruEstComando cmd = new RegistrarEmpGruEstComando(registrarEmpGruEst);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Emp_Gru_Est error = new Emp_Gru_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
}
