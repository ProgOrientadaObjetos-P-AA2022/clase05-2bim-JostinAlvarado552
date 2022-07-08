/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList();
        Persona p0 = new Persona("juan", 20);
        Persona p1 = new Persona("pepe", 19);
        Persona p2 = new Persona("hola", 21);
        Persona p3 = new Persona("edgar", 22);

        lista.add(p0);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        OperacionesEstudiantes e = new OperacionesEstudiantes();
        e.establecerEstudiante(lista);
        e.establecerPromedioEdades();

        System.out.println(e);

    }
}
