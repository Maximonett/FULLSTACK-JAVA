/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author maximosimonetti
 */
public class Principal {
    public static void main(String[] args) {
        
        Integer x=100;
        
        Vehiculo v1=new Vehiculo();
        v1.marca="Renault";
        v1.año=2022;
        v1.modelo="Clio";
        
        Vehiculo v2=new Vehiculo();
        v2.año=2001;
        
        Vehiculo v3=new Vehiculo("Chevrolet","Agile");
        Vehiculo v4=new Vehiculo();
        Vehiculo v5=new Vehiculo();
        
        v1.imprimir();
        v2.imprimir();
        v3.imprimir();
        v4.imprimir();
        v5.imprimir();
       
        
    }
            
            
}
