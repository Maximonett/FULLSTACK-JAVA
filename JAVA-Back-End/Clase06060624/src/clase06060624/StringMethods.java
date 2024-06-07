/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase06060624;
import java.util.Locale;
import java.util.StringJoiner;
/**
 *
 * @author maximosimonetti
 */
public class StringMethods {
    
    public static void main(String[] args) {
        //metodos de los String
        
        String cadena="Hola mundo...";
        int cantLetras =cadena.length();
        System.out.println("Cantidad de letras " +cantLetras);
                
                
        String cadena2="hola Mundo...";        
        
        boolean sonIguales=cadena.equals(cadena2);
        System.out.println("Son iguales: " +sonIguales);
        
        sonIguales=cadena.equalsIgnoreCase(cadena2);
        System.out.println("Son iguales: " +sonIguales);
         
        
        String mayus=cadena.toUpperCase();
        String minus=cadena.toLowerCase(Locale.ITALY);
        System.out.println(mayus);
        System.out.println(minus);
        
        String cadena3="            Hola Mundo......";
        String cadenaTrim=cadena3.trim();
        System.out.println(cadenaTrim);
        
        String cadena4="Hala Mundo...";
        String cadena5=cadena4.replace('a', 'o'); //reemplaza 'a' por la 'o'
        System.out.println(cadena5);
        
       //String cadena6=cadena2.contains(cadena4);
        
        
        
    }
 
           
    
}
