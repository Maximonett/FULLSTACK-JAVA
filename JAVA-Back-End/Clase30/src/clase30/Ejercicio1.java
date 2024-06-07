/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase30;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author maximosimonetti
 */
public class Ejercicio1 {
    
    public static void main(String[] args){
        
        System.out.println("Hola mundo");
        
        //comentarios de una linea
        /*comemtarios de incio y fin */
        
        //variables primitivas
        
        int edad=30;
        double altura =1.84;
        boolean esEstudiante=false;
        char inicial='N';
        float peso= 92.5f; //se debe colocar al final una 'f' para poder diferenciar de un double
        long otroDato=100000;
        
        
        
        System.out.println("El valor de la variable entera es: "+ edad);
       System.out.println("El valor de la variable double es: "+ altura);
       System.out.println("El valor de la variable boolean es: "+ esEstudiante);
       System.out.println("El valor de la variable char es: "+ inicial);
       System.out.println("El valor de la variable float es: "+ peso);
       System.out.println("El valor de la variable long es: "+ otroDato);
       
       
       String nombre="Nicolas";  // String es una clase y posee atributos por eso se escribe con mayuscula al principio
       
       System.out.println("El valor de la String es: "+nombre);
       
       
       //Wrapper
       
       Integer numeroEntero = Integer.valueOf(43);     //ahora es un objeto y no una variable
       
        System.out.println("Wraper es "+numeroEntero);
        
        LocalDate fechaActual=LocalDate.now();   
        
        System.out.println("La fecha de hoy es: "+fechaActual);
        
        //array no se pueden moodificar
        
        int[] numeros=new int[5];
        
        numeros[0]=21;
        numeros[1]=2;
        numeros[2]=21;
        numeros[3]=21;
        numeros[4]=21;
        
        int[] numeros1={34,2,3,7,1,8};
        
        String[] nombres={"Nicolas","Pedro","Andrea"};
        
        String numeroString="123";
        int numero=Integer.parseInt(numeroString);   // tranforma el numero de string en entero
        
        
        System.out.println(numero);
        
        
        
        
        int numero1 = Integer.parseInt(numeroString);
        
        
        if(edad>=18)
        {
            System.out.println("Sos mayor de edad");
        }
        else{
            System.out.println("No sos mayor de edad");
        }
        
        if(edad==18)
        {
            System.out.println("Te felicito");
        }
        else if(edad==19)
        {
            System.out.println("Que suerte tenes 19");
        }
        else{
            System.out.println("Que grande que sos ");
        }
        
        //switch
        /*Ingreso de un dato por pantalla a traves del metodo Scanner*/
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        
        
        int opc=ingreso.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("La opcion ingresada es un 1");
                break;
            case 2:
                System.out.println("La opcion ingresada es un 2");
                break;
            case 3:
                System.out.println("La opcion ingresada es un 3");
                break;
            default:
                System.out.println("La opcion es otra ");
                break;
        }
                
        opc=0;
        
        do{
            System.out.println("Iteracion dentro del do: "+opc);
            opc++;
        }while(opc!=5);
        
        opc=0;
        
        while(opc!=5)
        {
            System.out.println("Iteracion dentro del while: "+ opc);
            opc++;
        }
        
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        
        
        
        
        /*final del codigo no tocar de bajo*/
    }
    
}
