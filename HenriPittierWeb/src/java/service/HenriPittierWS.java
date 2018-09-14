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
import comun.Inasistencia;
import comun.Lugar;
import comun.Mensualidad_Representante;
import comun.Prestamo;
import comun.Rep_Est;
import comun.Representante;
import comun.Suplencia;
import comun.Usuario;
import controlador.modulo_emp_gru.AsignarPersonalComando;
import controlador.modulo_emp_gru.ConsultarAsignacionComando;
import controlador.modulo_emp_gru.RemoverPersonalComando;
import controlador.modulo_gru_est.BorrarEstudianteGrupoComando;
import controlador.modulo_gru_est.ConsultarEstudianteGrupoComando;
import controlador.modulo_gru_est.AsignarEstudianteGrupoComando;
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
import controlador.modulo_gru_est.ConsultarParametroEmpleadoGrupoComando;
import controlador.modulo_gru_est.ConsultarParametroEstudianteGrupoComando;
import controlador.modulo_grupos.BorrarGrupoComando;
import controlador.modulo_grupos.ConsultarGruposComando;
import controlador.modulo_grupos.ConsultarGrupoDetalleComando;
import controlador.modulo_grupos.ModificarGrupoComando;
import controlador.modulo_grupos.RegistrarGrupoComando;
import controlador.modulo_inasistencias.BorrarInasistenciaComando;
import controlador.modulo_inasistencias.ConsultarInasistenciaDetalleComando;
import controlador.modulo_inasistencias.ModificarInasistenciaComando;
import controlador.modulo_inasistencias.RegistrarInasistenciaComando;
import controlador.modulo_lugares.ConsultarEstadosComando;
import controlador.modulo_lugares.ConsultarMunicipiosComando;
import controlador.modulo_lugares.ConsultarParroquiasComando;
import controlador.modulo_mensualidad_representante.BorrarMensualidadComando;
import controlador.modulo_mensualidad_representante.ConsultarMensualidadComando;
import controlador.modulo_mensualidad_representante.ConsultarMensualidadDetalleComando;
import controlador.modulo_mensualidad_representante.ModificarMensualidadComando;
import controlador.modulo_mensualidad_representante.RegistrarMensualidadComando;
import controlador.modulo_prestamo.ActualizarPrestamoComando;
import controlador.modulo_prestamo.ConsultarPrestamoDetalleComando;
import controlador.modulo_repest.BorrarRepEstComando;
import controlador.modulo_repest.ConsultarRepEstComando;
import controlador.modulo_repest.ConsultarRepEstDetalleComando;
import controlador.modulo_repest.ConsultarRepEstDetalleEscolarComando;
import controlador.modulo_repest.ConsultarRepEstDetalleRepresentanteEstudianteComando;
import controlador.modulo_repest.RegistrarRepEstComando;
import controlador.modulo_representantes.BorrarRepresentanteComando;
import controlador.modulo_representantes.ConsultarRepresentanteDetalleComando;
import controlador.modulo_representantes.ConsultarRepresentantesComando;
import controlador.modulo_representantes.ModificarRepresentanteComando;
import controlador.modulo_representantes.RegistrarRepresentanteComando;
import controlador.modulo_suplencia.BorrarSuplenciaComando;
import controlador.modulo_suplencia.ConsultarSuplenciaDetalleComando;
import controlador.modulo_suplencia.ModificarSuplenciaComando;
import controlador.modulo_suplencia.RegistrarSuplenciaComando;
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
    
    /*WS DE Rep_Est*/
    @GET
    @Path("registrarREPEST")
    @Produces("application/json")
    public String registrarREPEST (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        Rep_Est registrarRepest = gson.fromJson(_repest, Rep_Est.class);
        RegistrarRepEstComando cmd = new RegistrarRepEstComando(registrarRepest);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Rep_Est error = new Rep_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarREPEST")
    @Produces("application/json")
    public String borrarREPEST (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        Rep_Est repestBorrar = gson.fromJson(_repest, Rep_Est.class);
        BorrarRepEstComando cmd = new BorrarRepEstComando(repestBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Rep_Est error = new Rep_Est();
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
            
            ArrayList<Rep_Est> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarREPESTDetalle")
    @Produces("application/json")
    public String consultarREPESTDetalle (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        Rep_Est repestConsultar = gson.fromJson(_repest, Rep_Est.class);
        ConsultarRepEstDetalleComando cmd = new ConsultarRepEstDetalleComando(repestConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Rep_Est error = new Rep_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarREPESTDetalleEscolar")
    @Produces("application/json")
    public String consultarREPESTDetalleEscolar (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        Rep_Est repestConsultar = gson.fromJson(_repest, Rep_Est.class);
        ConsultarRepEstDetalleEscolarComando cmd = new ConsultarRepEstDetalleEscolarComando(repestConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Rep_Est error = new Rep_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarREPESTDetalleRepresentanteEstudiante")
    @Produces("application/json")
    public String consultarREPESTDetalleRepresentanteEstudiante (@QueryParam("repest") String _repest){
        
        Gson gson = new GsonBuilder().create();
        Rep_Est repestConsultar = gson.fromJson(_repest, Rep_Est.class);
        ConsultarRepEstDetalleRepresentanteEstudianteComando cmd = new ConsultarRepEstDetalleRepresentanteEstudianteComando(repestConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Rep_Est error = new Rep_Est();
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
        Grupo grupoBorrar = gson.fromJson(_grupo, Grupo.class);
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
    @Path("consultarGrupos")
    @Produces("application/json")
    public String consultarGrupos (){
        
        ConsultarGruposComando cmd = new ConsultarGruposComando();
        
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
    
    /*WS de Gru_Est*/
    //@QueryParam("empgruest") String _empgruest
    @GET
    @Path("asignarEstudianteGrupo")
    @Produces("application/json")
    //@QueryParam("suplencia") String _suplencia
    public String asignarEstudianteGrupo (@QueryParam("est_gru") String _est_gru){
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est asignarEstudianteGrupo = gson.fromJson(_est_gru, Emp_Gru_Est.class);
        AsignarEstudianteGrupoComando cmd = new AsignarEstudianteGrupoComando(asignarEstudianteGrupo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Emp_Gru_Est error = new Emp_Gru_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarEstudianteGrupo")
    @Produces("application/json")
    public String borrarEstudianteGrupo (@QueryParam("est_gru") String _est_gru){
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est borrarEstudianteGrupo = gson.fromJson(_est_gru, Emp_Gru_Est.class);
        BorrarEstudianteGrupoComando cmd = new BorrarEstudianteGrupoComando(borrarEstudianteGrupo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Emp_Gru_Est error = new Emp_Gru_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarEstudianteGrupo")
    @Produces("application/json")
    public String consultarEstudianteGrupo (){
        
        ConsultarEstudianteGrupoComando cmd = new ConsultarEstudianteGrupoComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Emp_Gru_Est> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarParametroEstudianteGrupo")
    @Produces("application/json")
    public String consultarParametroEstudianteGrupo (@QueryParam("est_gru") String _est_gru){
        
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est consultarEstudianteGrupo = gson.fromJson(_est_gru, Emp_Gru_Est.class);
        ConsultarParametroEstudianteGrupoComando cmd = new ConsultarParametroEstudianteGrupoComando(consultarEstudianteGrupo);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Emp_Gru_Est> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarParametroEmpleadoGrupo")
    @Produces("application/json")
    public String consultarParametroEmpleadoGrupo (@QueryParam("est_gru") String _est_gru){
        
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est consultarEmpleadoGrupo = gson.fromJson(_est_gru, Emp_Gru_Est.class);
        ConsultarParametroEmpleadoGrupoComando cmd = new ConsultarParametroEmpleadoGrupoComando(consultarEmpleadoGrupo);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Emp_Gru_Est> error = null;
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE Inasistencia*/
    //@QueryParam("inasistencia") String _inasistencia
    @GET
    @Path("registrarInasistencia")
    @Produces("application/json")
    public String registrarInasistencia (@QueryParam("inasistencia") String _inasistencia){
        
        Gson gson = new GsonBuilder().create();
        Inasistencia registrarInasistencia = gson.fromJson(_inasistencia, Inasistencia.class);
        RegistrarInasistenciaComando cmd = new RegistrarInasistenciaComando(registrarInasistencia);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Inasistencia error = new Inasistencia();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("modificarInasistencia")
    @Produces("application/json")
    //@QueryParam("inasistencia") String _inasistencia
    public String modificarInasistencia (@QueryParam("inasistencia") String _inasistencia){
        
        Gson gson = new GsonBuilder().create();
        Inasistencia modificarInasistencia = gson.fromJson(_inasistencia, Inasistencia.class);
        ModificarInasistenciaComando cmd = new ModificarInasistenciaComando(modificarInasistencia);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Inasistencia error = new Inasistencia();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarInasistencia")
    @Produces("application/json")
    //@QueryParam("inasistencia") String _inasistencia
    public String borrarInasistencia (@QueryParam("inasistencia") String _inasistencia){
        
        Gson gson = new GsonBuilder().create();
        Inasistencia inasistenciaBorrar = gson.fromJson(_inasistencia, Inasistencia.class);
        BorrarInasistenciaComando cmd = new BorrarInasistenciaComando(inasistenciaBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Inasistencia error = new Inasistencia();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarInasistenciaDetalle")
    @Produces("application/json")
    public String consultarInasistenciaDetalle (@QueryParam("inasistencia") String _inasistencia){
        
        Gson gson = new GsonBuilder().create();
        Inasistencia inasistenciaConsultar = gson.fromJson(_inasistencia, Inasistencia.class);
        ConsultarInasistenciaDetalleComando cmd = new ConsultarInasistenciaDetalleComando(inasistenciaConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Inasistencia> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("registrarSuplencia")
    @Produces("application/json")
    //@QueryParam("suplencia") String _suplencia
    public String registrarSuplencia (@QueryParam("suplencia") String _suplencia){
        
        Gson gson = new GsonBuilder().create();
        Suplencia registrarSuplencia = gson.fromJson(_suplencia, Suplencia.class);
        RegistrarSuplenciaComando cmd = new RegistrarSuplenciaComando(registrarSuplencia);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Suplencia error = new Suplencia();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("modificarSuplencia")
    @Produces("application/json")
    //@QueryParam("suplencia") String _suplencia
    public String modificarSuplencia (@QueryParam("suplencia") String _suplencia){
        
        Gson gson = new GsonBuilder().create();
        Suplencia modificarSuplencia = gson.fromJson(_suplencia, Suplencia.class);
        ModificarSuplenciaComando cmd = new ModificarSuplenciaComando(modificarSuplencia);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Suplencia error = new Suplencia();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarSuplencia")
    @Produces("application/json")
    //@QueryParam("suplencia") String _suplencia
    public String borrarSuplencia (@QueryParam("suplencia") String _suplencia){
        
        Gson gson = new GsonBuilder().create();
        Suplencia suplenciaBorrar = gson.fromJson(_suplencia, Suplencia.class);
        BorrarSuplenciaComando cmd = new BorrarSuplenciaComando(suplenciaBorrar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Suplencia error = new Suplencia();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarSuplenciaDetalle")
    @Produces("application/json")
    public String consultarSuplenciaDetalle (@QueryParam("suplencia") String _suplencia){
        
        Gson gson = new GsonBuilder().create();
        Suplencia suplenciaConsultar = gson.fromJson(_suplencia, Suplencia.class);
        ConsultarSuplenciaDetalleComando cmd = new ConsultarSuplenciaDetalleComando(suplenciaConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Suplencia> error = null;
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE Lugares*/
    @GET
    @Path("consultarEstados")
    @Produces("application/json")
    public String consultarEstados (){
        
        ConsultarEstadosComando cmd = new ConsultarEstadosComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Lugar> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarMunicipios")
    @Produces("application/json")
    public String consultarMunicipios (@QueryParam("estado") String _municipio){
        
        Gson gson = new GsonBuilder().create();
        Lugar municipioConsultar = gson.fromJson(_municipio, Lugar.class);
        ConsultarMunicipiosComando cmd = new ConsultarMunicipiosComando(municipioConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Lugar> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarParroquias")
    @Produces("application/json")
    public String consultarParroquias (@QueryParam("municipio") String _parroquia){
        
        Gson gson = new GsonBuilder().create();
        Lugar parroquiaConsultar = gson.fromJson(_parroquia, Lugar.class);
        ConsultarParroquiasComando cmd = new ConsultarParroquiasComando(parroquiaConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Lugar> error = null;
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE Mensualidad_Representante*/
    @GET
    @Path("registrarMensualidadRepresentante")
    @Produces("application/json")
    public String registrarMensualidadRepresentante (@QueryParam("registrarMensualidad") String _registrarMensualidad){
        
        Gson gson = new GsonBuilder().create();
        Mensualidad_Representante registrarMensualidad = gson.fromJson(_registrarMensualidad, Mensualidad_Representante.class);
        RegistrarMensualidadComando cmd = new RegistrarMensualidadComando(registrarMensualidad);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Mensualidad_Representante error = new Mensualidad_Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("modificarMensualidadRepresentante")
    @Produces("application/json")
    public String modificarMensualidadRepresentante (@QueryParam("modificarMensualidad") String _modificarMensualidad){
        
        Gson gson = new GsonBuilder().create();
        Mensualidad_Representante modificarMensualidad = gson.fromJson(_modificarMensualidad, Mensualidad_Representante.class);
        ModificarMensualidadComando cmd = new ModificarMensualidadComando(modificarMensualidad);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Mensualidad_Representante error = new Mensualidad_Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("borrarMensualidadRepresentante")
    @Produces("application/json")
    public String borrarMensualidadRepresentante (@QueryParam("borrarMensualidad") String _borrarMensualidad){
        
        Gson gson = new GsonBuilder().create();
        Mensualidad_Representante borrarMensualidad = gson.fromJson(_borrarMensualidad, Mensualidad_Representante.class);
        BorrarMensualidadComando cmd = new BorrarMensualidadComando(borrarMensualidad);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Mensualidad_Representante error = new Mensualidad_Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarMensualidadRepresentante")
    @Produces("application/json")
    public String consultarMensualidadRepresentante (){
        
        ConsultarMensualidadComando cmd = new ConsultarMensualidadComando();
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Mensualidad_Representante> error = null;
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarMensualidadRepresentanteDetalle")
    @Produces("application/json")
    public String consultarMensualidadRepresentanteDetalle (@QueryParam("consultarMensualidad") String _consultarMensualidad){
        
        Gson gson = new GsonBuilder().create();
        Mensualidad_Representante mensualidadConsultar = gson.fromJson(_consultarMensualidad, Mensualidad_Representante.class);
        ConsultarMensualidadDetalleComando cmd = new ConsultarMensualidadDetalleComando(mensualidadConsultar);
        
        try {
            
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Mensualidad_Representante error = new Mensualidad_Representante();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS de Emp_Gru*/
    @GET
    @Path("asignarPersonal")
    @Produces("application/json")
    public String asignarPersonal (@QueryParam("emp_gru") String _emp_gru){
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est asignarGrupo = gson.fromJson(_emp_gru, Emp_Gru_Est.class);
        AsignarPersonalComando cmd = new AsignarPersonalComando(asignarGrupo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Emp_Gru_Est error = new Emp_Gru_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("removerPersonal")
    @Produces("application/json")
    public String removerPersonal (@QueryParam("emp_gru") String _emp_gru){
        
        Gson gson = new GsonBuilder().create();
        Emp_Gru_Est removerGrupo = gson.fromJson(_emp_gru, Emp_Gru_Est.class);
        RemoverPersonalComando cmd = new RemoverPersonalComando(removerGrupo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Emp_Gru_Est error = new Emp_Gru_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarAsignacion")
    @Produces("application/json")
    public String consultarAsignacion (){
        
        Gson gson = new GsonBuilder().create();
        ConsultarAsignacionComando cmd = new ConsultarAsignacionComando();
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Emp_Gru_Est error = new Emp_Gru_Est();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    /*WS DE PRESTAMO*/
    @GET
    @Path("registrarPrestamo")
    @Produces("application/json")
    public String registrarPrestamo (@QueryParam("prestamo") String _prestamo){
        
        Gson gson = new GsonBuilder().create();
        Prestamo registrarPrestamo = gson.fromJson(_prestamo, Prestamo.class);
        ActualizarPrestamoComando cmd = new ActualizarPrestamoComando(registrarPrestamo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            Prestamo error = new Prestamo();
            error.setError(RESULTADO_CODIGO_FALLIDO);
            return gson.toJson(error);
            
        }
    }
    
    @GET
    @Path("consultarPrestamoDetalle")
    @Produces("application/json")
    public String consultarPrestamoDetalle (@QueryParam("prestamo") String _prestamo){
        
        Gson gson = new GsonBuilder().create();
        Prestamo consultarPrestamo = gson.fromJson(_prestamo, Prestamo.class);
        ConsultarPrestamoDetalleComando cmd = new ConsultarPrestamoDetalleComando(consultarPrestamo);
        
        try {
        
            cmd.execute();
            return gson.toJson(cmd.obtenerRespuesta());
            
        } catch (Exception ex) {
            
            ArrayList<Prestamo> error = null;
            return gson.toJson(error);
            
        }
    }
}
