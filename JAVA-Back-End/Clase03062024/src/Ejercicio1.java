/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;

/**
 *
 * @author maximosimonetti
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        int tamano=10000;
        int[] numerosRandom=new int[tamano];
        
        Random random=new Random();
        
        double promedio=0;
        for (int x=0;x<tamano;x++){
            
            numerosRandom[x]=random.nextInt(9999);
            promedio=promedio+numerosRandom[x];
             promedio=promedio/tamano;
                    
              
        }
        
        
       
        
        System.out.println(" Los elementos son: ");
        for (int numero:numerosRandom){
            System.out.println(numero);
            
        }
        
        System.out.println(" El promedio es : " + promedio);  
         
          
          
          
          
    }
}
