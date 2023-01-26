/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class PersonaService {
    
    //Creo variables locales que me van a servir para el metodo estadistica
    int pi = 0, bp = 0, sp = 0, contMayor = 0, contMenor = 0;
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        String sexo;
        System.out.println("Ingrese el Nombre de la Persona");
        String nom = leer.next();
        System.out.println("Ingrese la Edad de la Persona");
        int edad = leer.nextInt();
        
        do{
            System.out.println("Ingrese el sexo de la persona 'H' para Hombre, 'M' para Mujer "
                    + "ú para 'O' para Otro");
            sexo = leer.next().toUpperCase();
            if(sexo.length() > 1){
                System.out.println("ERROR Ingresó más de una letra");
                bandera = false;
            }
            if(sexo.startsWith("H") || sexo.startsWith("M") || sexo.startsWith("O")){
                bandera = true;
            }else{
                System.out.println("ERROR Ingresó un sexo no valido");
                bandera = false;
            }
        }while(!bandera);
        
        System.out.println("Ingrese el peso de la Persona");
        float p = leer.nextFloat();
        System.out.println("Ingrese la altura de la Persona");
        double al = leer.nextDouble();
        leer.close();
        
        return new Persona(nom, edad, sexo, p, al);
    }
    
    public int calcularIMC(Persona p){
        int imc = 0;
        if((p.getPeso()) / (p.getAltura() * p.getAltura()) > 25){
            imc = 1;
            sp++;
            System.out.println("Sobrepeso");
        }else if((p.getPeso()) / (p.getAltura() * p.getAltura()) >= 20){
            imc = 0;
            pi++;
            System.out.println("Peso Ideal");
        }else{
            imc = -1;
            bp++;
            System.out.println("Bajo Peso");
        }
        return imc;
    }
    
    Persona p;
    
    public boolean esMayorEdad(Persona p){
        boolean mayor = false;
        try{
            if(p.getEdad() > 18){
                mayor = true;
                contMayor++;
            }else{
                contMenor++;
            }
        }catch(RuntimeException e){
            System.out.println(e.toString());
        }
        
        return mayor;
    }
    
    public void estadistica(int cantPersonas){
        System.out.println("*****************************************");
        System.out.println("**              NUMERICO               **");
        System.out.println("*****************************************");
        System.out.println(contMayor + " Personas son mayores de edad");
        System.out.println(contMenor + " Personas son menores de edad");
        System.out.println(pi + " Personas tienen el peso ideal");
        System.out.println(bp + " Personas tienen bajo peso");
        System.out.println(sp + " Personas tienen sobrepeso");
        System.out.println("*****************************************");
        System.out.println("**             PORCENTAJES             **");
        System.out.println("*****************************************");
        System.out.println("El % de personas Mayores de edad es " + (contMayor * 100) / cantPersonas + "%");
        System.out.println("El % de personas Menores de edad es " + (contMenor * 100) / cantPersonas + "%");
        System.out.println("El % de personas con peso ideal es " + (pi * 100) / cantPersonas + "%");
        System.out.println("El % de personas con sobrepeso es " + (sp * 100) / cantPersonas + "%");
        System.out.println("El % de personas con bajo peso es " + (bp * 100) / cantPersonas + "%");
    }
    
}
