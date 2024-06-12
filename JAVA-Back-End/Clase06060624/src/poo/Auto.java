/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author maximosimonetti
 */
public class Auto extends Vehiculo {
    
    public int cantPasajeros;
    public boolean esSedan;


    
    public String imprimir(){
        return 
                "Marca: "+getMarca()+" Modelo: "+getModelo()+" Año: "+getAño()+ "Pasajeros "+this.cantPasajeros+ "Es sedan: "+this.esSedan ;
        
    }

}
