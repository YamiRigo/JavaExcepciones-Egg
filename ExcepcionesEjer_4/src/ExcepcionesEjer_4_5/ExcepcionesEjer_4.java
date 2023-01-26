/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesEjer_4_5;

import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/

public class ExcepcionesEjer_4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivina el número entre 1 y 500");
        int intentos = 0;
        int adivinar = 1 + (int)(Math.random() * 500);
        int num = -1;
        
        while(true){
            System.out.println("Intentos: " + intentos);
            System.out.println("Ingrese un número");
            try{
                num = Integer.parseInt(leer.nextLine());
            }catch(Exception e){
                System.out.println("No ingreso un número");
            }
            
            intentos++;
            if(num == adivinar){
                break;
            }
            
            System.out.println("FELICITACIONES");
            System.out.println("Lo adivino en " + intentos + " intentos");
        }
        
    }
    
}
