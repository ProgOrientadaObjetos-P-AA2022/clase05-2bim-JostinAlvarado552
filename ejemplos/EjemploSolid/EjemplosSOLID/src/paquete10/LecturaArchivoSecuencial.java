/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete10.GeneradorPeliculas;
import paquete10.APIDirectvGo;

public class LecturaArchivoSecuencial {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> peliculas;
    private String nombreArchivo;

    public LecturaArchivoSecuencial(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerPeliculas() {
        // 
        peliculas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                    peliculas.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<GeneradorPeliculas> obtenerPeliculas() {
        return peliculas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Peliculas\n";
        for (int i = 0; i < obtenerPeliculas().size(); i++) {
            GeneradorPeliculas p = obtenerPeliculas().get(i);
            cadena = String.format("%s\n%s", cadena, peliculas.get(i).obtenerUrl());
        }

        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
}
