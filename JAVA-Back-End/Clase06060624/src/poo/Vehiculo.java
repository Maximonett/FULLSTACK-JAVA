/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author maximosimonetti
 */
public class Vehiculo {
    
    //atributos
    public String marca;
    public String modelo;        
    public int año;
    public String color;
    public double precio;

    //Metodo contructor por defecto 
    public Vehiculo()
    {
        this.marca="Desconocido";
        this.modelo="Desconocido";
        this.año=0;
        this.color="Desconocido";
        this.precio=0.0;
    }
    //Metodo constructor siempre tiene el mismo nombre que la clase
    public Vehiculo(String marca,String modelo)
    {
        this.marca = marca;
        this.modelo= modelo;
    }
    
    public Vehiculo(String marca,String modelo,int año)
    {
        this.marca = marca;
        this.modelo= modelo;
        this.año=año;
  
    }
    
    public void imprimir(){
        System.out.println("Marca: "+this.marca+" Modelo: "+this.modelo+" Año: "+this.año);
        
    }
}


