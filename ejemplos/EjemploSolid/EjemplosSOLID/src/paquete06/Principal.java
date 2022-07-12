/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito("MasterCard", "10239180", 1000);
        MayorEdad representante = new MayorEdad("José", tarjeta);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s\n%s - %.2f\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCodigo(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCupo());

    }
}
