/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yamila
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        System.out.println("");
        return "Persona" 
                + "\nNombre: " + nombre 
                + "\nEdad: " + edad 
                + "\nSexo: " + sexo 
                + "\nPeso: " + peso + " kg"
                + "\nAltura: " + altura + " mts";
    } 
    
    
    
}
