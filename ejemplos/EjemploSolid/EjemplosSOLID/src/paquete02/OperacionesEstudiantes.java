/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {

        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }

        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public String toString() {
        String cadena = "Listado de Estudiantes";
        for (int i = 0; i < obtenerEstudiante().size(); i++) {
            cadena = String.format("%s\n[%d]%s", cadena, i + 1,
                    obtenerEstudiante().get(i).obtenerNombre());
        }
        cadena = String.format("%s\nPromedio de las Edades: %.2f\n", cadena,
                promedioEdades);

        return cadena;
    }

}
