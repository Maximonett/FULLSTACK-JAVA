/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.max.estructuras;

/**
 *
 * @author maximosimonetti
 */
public class Estructuras {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int numero = 5;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }   

        int i = 0;
        while (i < 10) {
        System.out.println(i);
        i++;
        }

   
        int j = 0;
        do {
        System.out.println(j);
        j++;
        } while (j < 10);
        
        
        int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día no válido");
}

int[] enteros = {1, 2, 3, 4, 5};
for (int entero : enteros) {
    System.out.println(entero);
}

}
    
}


