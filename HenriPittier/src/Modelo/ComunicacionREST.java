/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import comun.Empleado;
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
            URL url = new URL("http://"+ip+":8084/HenriPittierWeb/webresources/WS/" + _urlMetodo);
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
    /*SERVICIOS WEB DE EMPLEADOS*/
}
    






