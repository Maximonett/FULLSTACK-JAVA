/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.codoacodo;

/**
 *
 * @author maximosimonetti
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
        
        sumar(15,15);   
         System.out.println(sumar2(15,15));
         
         saludar("nicolas");
         
         Persona persona1=new Persona("Nicolas",43);
         persona1.mostrarInfo();
         Persona persona2=new Persona("Maria",41);
         
         mostrarPersona(persona1);
         mostrarPersona(persona2);
         
     }
     
     public static void mostrarPersona(Persona persona){
         System.out.println("La informacion es : ");
         persona.mostrarInfo();
         
     }
     
     
     public static void sumar(int a,int b){ // si dice void no puede tener un return porque no devuelve nada!!!!!
         System.out.println(a+b);
         
     }     
                  
     public static int sumar2(int a,int b){
         return a+b;
     }   
     
     public static void saludar(String x){
         System.out.println("Hola "+x);
     
     }
     
     public static int dividir(int a, int b){
         return a/b;
         
     }
     
     
}

