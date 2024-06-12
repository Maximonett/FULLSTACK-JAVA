/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author maximosimonetti
 */
public abstract class Vehiculo {
    
    //atributos
    private String marca;
    private String modelo;        
    private int año;
    private String color;
    private double precio;
    private int tamañoTanque;
    private int cantCombustible;

    //Metodo contructor por defecto 
    public Vehiculo()
    {
        this.marca="Desconocido";
        this.modelo="Desconocido";
        this.año=0;
        this.color="Desconocido";
        this.precio=0.0;
        this.tamañoTanque=50;
        this.cantCombustible=5;
    }
    //Metodo constructor siempre tiene el mismo nombre que la clase
    public Vehiculo(String marca,String modelo)
    {
        this.marca = marca;
        this.modelo= modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTamañoTanque() {
        return tamañoTanque;
    }

    public void setTamañoTanque(int tamañoTanque) {
        this.tamañoTanque = tamañoTanque;
    }

    public int getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(int cantCombustible) {
        this.cantCombustible = cantCombustible;
    }
    
    
    
    public Vehiculo(String marca,String modelo,int año)
    {
        this.marca = marca;
        this.modelo= modelo;
        this.año=año;
  
    }
    public String imprimir3(){
    
        return  
                "Marca "+ this.marca +" Modelo "+ this.modelo ;
    }
    
    public String imprimir(){
        return
        "Marca: "+this.marca+" Modelo: "+this.modelo+" Año: "+this.año ;
        
    }
    
    public void acelerar(){
        if(this.cantCombustible>1){
        System.out.println("El auto acelero");
        }else{
            System.out.println("El auto no tiene combustible");
        }        
    }



}


