/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesEjer_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/

public class ExcepcionesEjer_3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Integer n1 = 0, n2 = 0;
        Integer n3 = 0;
        System.out.println("Ingrese dos números");
        String num1 = leer.next();
        String num2 = leer.next();
        
        try{
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
            System.out.println("La división entre los dos números es: " + n1 / n2);
            System.out.println("Ingrese el tercer número");
            n3 = leer.nextInt();
            System.out.println("El producto del tercer número y la división es: " + n3 * (n1 / n2));
        }catch(NumberFormatException e){
            System.out.println("Excepción de parseInt");
            System.out.println(e.toString());
        }catch(ArithmeticException e){
            System.out.println("Excepción división por CERO");
            System.out.println(e.toString());
        }catch(InputMismatchException e){
            System.out.println("Excepción de Ingreso");
            System.out.println(e.toString());
        }finally{
            System.out.println("TERMINO");
        }
        
    }
    
}
