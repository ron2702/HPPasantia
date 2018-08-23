/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author LuisAlejandro
 */
public class ManejadorImagen {
    public byte[] obtenerBytesDeArchivo(File archivo) throws FileNotFoundException, IOException{
        // Creamos el archivo que vamos a enviar

        // Obtenemos el tama�o del archivo
        int tamanoArchivo = ( int )archivo.length();

        FileInputStream fis = new FileInputStream(archivo.getAbsolutePath());
        BufferedInputStream bis = new BufferedInputStream( fis );

        // Creamos un array de tipo byte con el tama�o del archivo 
        byte[] bufferCompleto = new byte[ tamanoArchivo ];

        //SE CREA UNA ARRAY DE TIPO BYTE CON EL TAMANO PARCIAL DE LA LECTURA

        // Leemos el archivo y lo introducimos en el array de bytes 
        bis.read( bufferCompleto ); 

        bis.close(); //SE CIERRA LA LECTURA DEL ARCHIVO
        return bufferCompleto;
    }
}
