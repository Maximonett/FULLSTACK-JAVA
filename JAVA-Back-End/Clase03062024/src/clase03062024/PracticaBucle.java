/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase03062024;

/**
 *
 * @author maximosimonetti
 */
public class PracticaBucle {
    
     public static void main(String[] args){
     
     
     //Array
     
     int[] numeros= {11,23,3,4,5,6,6000,7,8,9,90,76,100,4,8,3000,31,0};
     
     
         for (int i = 0; i < numeros.length; i++) {
             
             System.out.println("El valor del array en la pos["+i + "]=" + numeros[i]);   
                   
             
         }
         
         for(int numero: numeros){
         
             System.out.println(" El valor del array es: "+numero);
         
         }
         
         //busco el maximo del array
         
         int maximo=0;
         
         for (int i = 0; i < numeros.length; i++) 
         {             
             if(numeros[i]>maximo) 
             {
                 maximo=numeros[i];
             }                 
        
         }
         System.out.println(" El maximo valor es: "+maximo);
     
     
         maximo=0;
         
         for(int numero:numeros)        
             if(numero>maximo)
                maximo=numero;
         System.out.println("El maximo es: "+maximo);
         
         
         //*hacer minimo!!!!
     
     /* Single Responsability (Solid)*/
     
     
     }
}
