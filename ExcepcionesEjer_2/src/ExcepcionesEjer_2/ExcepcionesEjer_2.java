/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesEjer_2;

/**
 *
 * @author yamila
 */

/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/

public class ExcepcionesEjer_2 {

    public static void main(String[] args) {
        
        int[] miVector = new int[10];
        
        try{
            for (int i = 0; i < 11; i++) {
                miVector[i] = (int)Math.random() * 50 + 1;
                System.out.println("[" + i + "]");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        
        System.out.println("Acá termmina");
        
    }
    
}
