/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.codoacodo;

/**
 *
 * @author maximosimonetti
 */
public class ManejodeExcepciones {
    public static void main(String[] args){
        
        
        try{
            //eror aritmetico
            int result=division(10,0);
            System.out.println("E resultado es: " +result);
        }
        catch(ArithmeticException e){ //simpre se ponen los casos particulares
            System.out.println("No se puede dividir por cero"); 
        }
        catch(Exception e){ //despues los casos generales
            System.out.println("Hay otro error");
        }
        
        //fuera de rango
        
        try {
            int[] numeros={1,2,3,4,5};
            System.out.println(numeros[12]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estas fuera de rango");
        
        }
        
        
    }
    
    
    
    
    public static int division(int a,int b){
        return a/b;
    }
           
    
}
