/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

public class Principal3 {

    public static void main(String[] args) {
        String nombreArchivo = "Peliculas.data";
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerPeliculas();
        System.out.println(lectura);

    }

}
