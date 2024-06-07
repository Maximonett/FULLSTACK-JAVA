/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author maximosimonetti
 */
public class ArrayMethods {
    public static void main(String[] args){
    
        
        //toString--> Convierte a String
        
        int[] array={1,2,3,4,5,6,7};
        
        String arrayToString=Arrays.toString(array);
        System.out.println(arrayToString);
        
        
        
        //copyOf
        
        int[] arrayCopia=Arrays.copyOf(array,5);
        System.out.println(Arrays.toString(arrayCopia));
        
        //equals
        int[] array2={1,2,3,4,5,6,7};
        
        boolean esIgual=Arrays.equals(array, array2);
        
        System.out.println(" Son iguales?: " +esIgual);
        
        //sort()
        
        int[] array3={1,2,3,40,200,20,800,4,5,6,7};
    
        Arrays.sort(array3);
         System.out.println(Arrays.toString(array3));
         
         
        //asList()
        
        String[] frutas={"peras","Manzanas","uvas"};
        
        List<String> frutasLista=Arrays.asList(frutas);
                
        frutasLista.add("Cocos");
    
    }
}
