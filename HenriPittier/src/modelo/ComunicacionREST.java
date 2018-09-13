/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo; 
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import comun.Emp_Gru_Est;
import comun.Empleado;
import comun.Estudiante;
import comun.Grupo;
import comun.Inasistencia;
import comun.Lugar;
import comun.Mensualidad_Representante;
import comun.Rep_Est;
import comun.Representante;
import comun.Suplencia;
import comun.Usuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/**
 *
 * @author LuisAlejandro
 */
public class ComunicacionREST {
    private String ip = "localhost";
    private static HttpURLConnection conn;

    private BufferedReader comunicar(String _etiquetaHTTP, String _urlMetodo) throws IOException {
        try {
            URL url = new URL("http://"+ip+":8085/HenriPittierWeb/webresources/WS/" + _urlMetodo);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(_etiquetaHTTP);
            conn.setRequestProperty("Accept", "application/json");
            conn.setConnectTimeout(3000); //set timeout to 5 seconds

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            return br;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Usuario iniciarSesion(Usuario u) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "inicioSesionUsuario?usuario=" + URLEncoder.encode(gson.toJson(u).toString(), "UTF-8"));
            String output;
            Usuario _usuario = new Usuario();
            while ((output = br.readLine()) != null) {
                _usuario = gson.fromJson(output, Usuario.class);
            }
            conn.disconnect();
            return _usuario;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE EMPLEADOS*/    
    public Empleado registrarEmpleado(Empleado e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarEmpleado?empleado=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Empleado _empleado = new Empleado();
            while ((output = br.readLine()) != null) {
                _empleado = gson.fromJson(output, Empleado.class);
            }
            conn.disconnect();
            return _empleado;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Empleado modificarEmpleado(Empleado e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarEmpleado?empleado=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Empleado _empleado = new Empleado();
            while ((output = br.readLine()) != null) {
                _empleado = gson.fromJson(output, Empleado.class);
            }
            conn.disconnect();
            return _empleado;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Empleado consultarEmpleadoDetalle(Empleado e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarEmpleadoDetalle?empleado=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Empleado _empleado = new Empleado();
            while ((output = br.readLine()) != null) {
                _empleado = gson.fromJson(output, Empleado.class);
            }
            conn.disconnect();
            return _empleado;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Empleado> consultarEmpleados() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarEmpleados");
            String output;
            ArrayList<Empleado> _empleado = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Empleado>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _empleado = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _empleado;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Empleado borrarEmpleado(Empleado e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarEmpleado?empleado=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Empleado _empleado = new Empleado();
            while ((output = br.readLine()) != null) {
                _empleado = gson.fromJson(output, Empleado.class);
            }
            conn.disconnect();
            return _empleado;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE REPRESENTANTES*/
    
    public Representante registrarRepresentante(Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarRepresentante?representante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Representante _representante = new Representante();
            while ((output = br.readLine()) != null) {
                _representante = gson.fromJson(output, Representante.class);
            }
            conn.disconnect();
            return _representante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
     
    public Representante modificarRepresentante(Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarRepresentante?representante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Representante _representante = new Representante();
            while ((output = br.readLine()) != null) {
                _representante = gson.fromJson(output, Representante.class);
            }
            conn.disconnect();
            return _representante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Representante borrarRepresentante(Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarRepresentante?representante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Representante _representante = new Representante();
            while ((output = br.readLine()) != null) {
                _representante = gson.fromJson(output, Representante.class);
            }
            conn.disconnect();
            return _representante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Representante> consultarRepresentantes() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarRepresentantes");
            String output;
            ArrayList<Representante> _representantes = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Representante>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _representantes = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _representantes;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Representante consultarRepresentanteDetalle(Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarRepresentanteDetalle?representante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Representante _representante = new Representante();
            while ((output = br.readLine()) != null) {
                _representante = gson.fromJson(output, Representante.class);
            }
            conn.disconnect();
            return _representante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    /*SERVICIOS WEB DE LUGARES*/
    public ArrayList<Lugar> consultarEstados() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "consultarEstados");
            String output;
            ArrayList<Lugar> _lugares = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Lugar>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _lugares = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _lugares;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    public ArrayList<Lugar> consultarMunicipios(Lugar estado) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "consultarMunicipios?estado=" + URLEncoder.encode(gson.toJson(estado).toString(), "UTF-8"));
            String output;
            ArrayList<Lugar> _lugares = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Lugar>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _lugares = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _lugares;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    public ArrayList<Lugar> consultarParroquias(Lugar municipio) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "consultarParroquias?municipio=" + URLEncoder.encode(gson.toJson(municipio).toString(), "UTF-8"));
            String output;
            ArrayList<Lugar> _lugares = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Lugar>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _lugares = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _lugares;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE ESTUDIANTE*/
    public Estudiante registrarEstudiante(Estudiante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarEstudiante?estudiante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Estudiante _estudiante = new Estudiante();
            while ((output = br.readLine()) != null) {
                _estudiante = gson.fromJson(output, Estudiante.class);
            }
            conn.disconnect();
            return _estudiante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Estudiante modificarEstudiante(Estudiante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarEstudiante?estudiante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Estudiante _estudiante = new Estudiante();
            while ((output = br.readLine()) != null) {
                _estudiante = gson.fromJson(output, Estudiante.class);
            }
            conn.disconnect();
            return _estudiante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Estudiante> consultarEstudiantes() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarEstudiantes");
            String output;
            ArrayList<Estudiante> _estudiante = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Estudiante>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _estudiante = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _estudiante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Estudiante consultarEstudianteDetalle(Estudiante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarEstudianteDetalle?estudiante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Estudiante _estudiante = new Estudiante();
            while ((output = br.readLine()) != null) {
                _estudiante = gson.fromJson(output, Estudiante.class);
            }
            conn.disconnect();
            return _estudiante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Estudiante borrarEstudiante(Estudiante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarEstudiante?estudiante=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Estudiante _estudiante = new Estudiante();
            while ((output = br.readLine()) != null) {
                _estudiante = gson.fromJson(output, Estudiante.class);
            }
            conn.disconnect();
            return _estudiante;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE GRUPO*/
    public Grupo registrarGrupo(Grupo e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarGrupo?grupo=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Grupo _grupo = new Grupo();
            while ((output = br.readLine()) != null) {
                _grupo = gson.fromJson(output, Grupo.class);
            }
            conn.disconnect();
            return _grupo;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Grupo modificarGrupo(Grupo e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarGrupo?grupo=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Grupo _grupo = new Grupo();
            while ((output = br.readLine()) != null) {
                _grupo = gson.fromJson(output, Grupo.class);
            }
            conn.disconnect();
            return _grupo;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Grupo borrarGrupo(Grupo e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarGrupo?grupo=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Grupo _grupo = new Grupo();
            while ((output = br.readLine()) != null) {
                _grupo = gson.fromJson(output, Grupo.class);
            }
            conn.disconnect();
            return _grupo;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Grupo> consultarGrupos() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarGrupos");
            String output;
            ArrayList<Grupo> _grupo = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Grupo>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _grupo = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _grupo;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Grupo consultarGrupoDetalle(Grupo e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarGrupoDetalle?grupo=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Grupo _grupo = new Grupo();
            while ((output = br.readLine()) != null) {
                _grupo = gson.fromJson(output, Grupo.class);
            }
            conn.disconnect();
            return _grupo;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE SUPLENCIAS*/
    
    public Suplencia registrarSuplencia(Suplencia s) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarSuplencia?suplencia=" + URLEncoder.encode(gson.toJson(s).toString(), "UTF-8"));
            String output;
            Suplencia _suplencia = new Suplencia();
            while ((output = br.readLine()) != null) {
                _suplencia = gson.fromJson(output, Suplencia.class);
            }
            conn.disconnect();
            return _suplencia;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Suplencia borrarSuplencia(Suplencia s) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarSuplencia?suplencia=" + URLEncoder.encode(gson.toJson(s).toString(), "UTF-8"));
            String output;
            Suplencia _suplencia = new Suplencia();
            while ((output = br.readLine()) != null) {
                _suplencia = gson.fromJson(output, Suplencia.class);
            }
            conn.disconnect();
            return _suplencia;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Suplencia modificarSuplencia(Suplencia s) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarSuplencia?suplencia=" + URLEncoder.encode(gson.toJson(s).toString(), "UTF-8"));
            String output;
            Suplencia _suplencia = new Suplencia();
            while ((output = br.readLine()) != null) {
                _suplencia = gson.fromJson(output, Suplencia.class);
            }
            conn.disconnect();
            return _suplencia;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Suplencia> consultarSuplencias(Suplencia s) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "consultarSuplenciaDetalle?suplencia=" + URLEncoder.encode(gson.toJson(s).toString(), "UTF-8"));
            String output;
            ArrayList<Suplencia> _suplencias = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Suplencia>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _suplencias = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _suplencias;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE INASISTENCIAS*/
    
    public Inasistencia registrarInasistencia(Inasistencia i) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarInasistencia?inasistencia=" + URLEncoder.encode(gson.toJson(i).toString(), "UTF-8"));
            String output;
            Inasistencia _inasistencia = new Inasistencia();
            while ((output = br.readLine()) != null) {
                _inasistencia = gson.fromJson(output, Inasistencia.class);
            }
            conn.disconnect();
            return _inasistencia;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Inasistencia borrarInasistencia(Inasistencia i) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarInasistencia?inasistencia=" + URLEncoder.encode(gson.toJson(i).toString(), "UTF-8"));
            String output;
            Inasistencia _inasistencia = new Inasistencia();
            while ((output = br.readLine()) != null) {
                _inasistencia = gson.fromJson(output, Inasistencia.class);
            }
            conn.disconnect();
            return _inasistencia;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    
    public Inasistencia modificarInasistencia(Inasistencia i) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarInasistencia?inasistencia=" + URLEncoder.encode(gson.toJson(i).toString(), "UTF-8"));
            String output;
            Inasistencia _inasistencia = new Inasistencia();
            while ((output = br.readLine()) != null) {
                _inasistencia = gson.fromJson(output, Inasistencia.class);
            }
            conn.disconnect();
            return _inasistencia;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Inasistencia> consultarInasistencias(Inasistencia i) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "consultarInasistenciaDetalle?inasistencia=" + URLEncoder.encode(gson.toJson(i).toString(), "UTF-8"));
            String output;
            ArrayList<Inasistencia> _inasistencias = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Inasistencia>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _inasistencias = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _inasistencias;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE Rep_Est*/
    public Rep_Est registrarRepEst(Rep_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarREPEST?repest=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Rep_Est _repest = new Rep_Est();
            while ((output = br.readLine()) != null) {
                _repest = gson.fromJson(output, Rep_Est.class);
            }
            conn.disconnect();
            return _repest;
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public Rep_Est borrarRepEst(Rep_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarREPEST?repest=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Rep_Est _repest = new Rep_Est();
            while ((output = br.readLine()) != null) {
                _repest = gson.fromJson(output, Rep_Est.class);
            }
            conn.disconnect();
            return _repest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Rep_Est> consultarRepEst() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            ArrayList<Rep_Est> _repest = new ArrayList<>();
            BufferedReader br = comunicar("GET", "consultarREPEST");
            String output;
            Type listType = new TypeToken<ArrayList<Rep_Est>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _repest = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _repest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Rep_Est> consultarRep_EstDetalle(Rep_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            ArrayList<Rep_Est> _repest = new ArrayList<>();
            BufferedReader br = comunicar("GET", "consultarREPESTDetalle?repest=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Type listType = new TypeToken<ArrayList<Rep_Est>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _repest = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _repest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
        
    public ArrayList<Rep_Est> consultarRep_EstDetalle_Escolar(Rep_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            ArrayList<Rep_Est> _repest = new ArrayList<>();
            BufferedReader br = comunicar("GET", "consultarREPESTDetalleEscolar?repest=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Type listType = new TypeToken<ArrayList<Rep_Est>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _repest = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _repest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Rep_Est consultarRep_EstDetalle_Representante_Estudiante(Rep_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "consultarREPESTDetalleRepresentanteEstudiante?repest=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Rep_Est _repest = new Rep_Est();
            while ((output = br.readLine()) != null) {
                _repest = gson.fromJson(output, Rep_Est.class);
            }
            conn.disconnect();
            return _repest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Mensualidad_Representante registrarMensualidad(Mensualidad_Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "registrarMensualidadRepresentante?registrarMensualidad=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Mensualidad_Representante _mensualidad = new Mensualidad_Representante();
            while ((output = br.readLine()) != null) {
                _mensualidad = gson.fromJson(output, Mensualidad_Representante.class);
            }
            conn.disconnect();
            return _mensualidad;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Mensualidad_Representante modificarMensualidad(Mensualidad_Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "modificarMensualidadRepresentante?modificarMensualidad=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Mensualidad_Representante _mensualidad = new Mensualidad_Representante();
            while ((output = br.readLine()) != null) {
                _mensualidad = gson.fromJson(output, Mensualidad_Representante.class);
            }
            conn.disconnect();
            return _mensualidad;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Mensualidad_Representante borrarMensualidad(Mensualidad_Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().create();
            BufferedReader br = comunicar("GET", "borrarMensualidadRepresentante?borrarMensualidad=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Mensualidad_Representante _mensualidad = new Mensualidad_Representante();
            while ((output = br.readLine()) != null) {
                _mensualidad = gson.fromJson(output, Mensualidad_Representante.class);
            }
            conn.disconnect();
            return _mensualidad;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Mensualidad_Representante> consultarMensualidad() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarMensualidadRepresentante");
            String output;
            ArrayList<Mensualidad_Representante> _mensualidad = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Mensualidad_Representante>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _mensualidad = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _mensualidad;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Mensualidad_Representante consultarMensualidadDetalle(Mensualidad_Representante e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarMensualidadRepresentanteDetalle?consultarMensualidad=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Mensualidad_Representante _mensualidad = new Mensualidad_Representante();
            while ((output = br.readLine()) != null) {
                _mensualidad = gson.fromJson(output, Mensualidad_Representante.class);
            }
            conn.disconnect();
            return _mensualidad;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE GRU_EST*/
    public Emp_Gru_Est asignarEstudianteGrupo(Emp_Gru_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "asignarEstudianteGrupo?est_gru=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Emp_Gru_Est emp_gru = new Emp_Gru_Est();
            while ((output = br.readLine()) != null) {
                emp_gru = gson.fromJson(output, Emp_Gru_Est.class);
            }
            conn.disconnect();
            return emp_gru;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Emp_Gru_Est borrarEstudianteGrupo(Emp_Gru_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "borrarEstudianteGrupo?est_gru=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Emp_Gru_Est emp_gru = new Emp_Gru_Est();
            while ((output = br.readLine()) != null) {
                emp_gru = gson.fromJson(output, Emp_Gru_Est.class);
            }
            conn.disconnect();
            return emp_gru;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Emp_Gru_Est> consultarEstudiantesGrupo() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarEstudianteGrupo");
            String output;
            ArrayList<Emp_Gru_Est> _gruest = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Emp_Gru_Est>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _gruest = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _gruest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Emp_Gru_Est> consultarParametroEstudiantesGrupo(Emp_Gru_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarParametroEstudianteGrupo?est_gru=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            ArrayList<Emp_Gru_Est> _gruest = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Emp_Gru_Est>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _gruest = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _gruest;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    /*SERVICIOS WEB DE EMP_GRU*/
    
    public Emp_Gru_Est asignarPersonal(Emp_Gru_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "asignarPersonal?emp_gru=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Emp_Gru_Est emp_gru = new Emp_Gru_Est();
            while ((output = br.readLine()) != null) {
                emp_gru = gson.fromJson(output, Emp_Gru_Est.class);
            }
            conn.disconnect();
            return emp_gru;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public Emp_Gru_Est removerPersonal(Emp_Gru_Est e) throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "removerPersonal?emp_gru=" + URLEncoder.encode(gson.toJson(e).toString(), "UTF-8"));
            String output;
            Emp_Gru_Est emp_gru = new Emp_Gru_Est();
            while ((output = br.readLine()) != null) {
                emp_gru = gson.fromJson(output, Emp_Gru_Est.class);
            }
            conn.disconnect();
            return emp_gru;
        }
        catch (Exception ex){
            throw ex;
        }
    }
    
    public ArrayList<Emp_Gru_Est> consultarAsignacion() throws Exception {
        try {
            conn = null;
            Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new JsonDateDeserializer()).create();
            BufferedReader br = comunicar("GET", "consultarAsignacion");
            String output;
            ArrayList<Emp_Gru_Est> _empgru = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Emp_Gru_Est>>() {}.getType();
            while ((output = br.readLine()) != null) {
                _empgru = gson.fromJson(output, listType);
            }
            conn.disconnect();
            return _empgru;
        }
        catch (Exception ex){
            throw ex;
        }
    }
}
    






