/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.codoacodo;

/**
 *
 * @author maximosimonetti
 */
public class Persona {
    //atributos de la clase
    private String nombre;
    private int edad;
    private boolean habilitado;
    
    
    public Persona(String nombre,int edad){
    
        this.nombre=nombre;
        this.edad=edad;
        this.habilitado=true;
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

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+ "Edad: "+this.edad);
    }
}
