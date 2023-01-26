/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesEjer_1;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author yamila
 */

/*Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.*/

public class ExcepcionesEjer_1 {

    public static void main(String[] args) {
       
        PersonaService s = new PersonaService();
        Persona p1 = new Persona();
        p1.setNombre("Adrian");
        p1.setEdad(42);
        p1.setSexo("H");
        p1.setPeso(98);
        p1.setAltura(1.80);
        
        Persona p2 = new Persona("William", 33, "O", 78, 1.86);
        Persona p3 = new Persona("Alina", 9, "F", 37, 1.52);
        
        System.out.println(p1);
        s.calcularIMC(p1);
        s.esMayorEdad(p1);
        
        System.out.println(p2);
        s.calcularIMC(p2);
        s.esMayorEdad(p2);
        
        System.out.println(p3);
        s.calcularIMC(p3);
        s.esMayorEdad(null);
        
        
    }
    
}
