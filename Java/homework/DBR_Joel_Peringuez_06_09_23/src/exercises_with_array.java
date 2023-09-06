/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class exercises_with_array {
    public void sum_of_numbers(){
    /*Crea un programa que sume todos los elementos de un array de números enteros.*/
     int[] numeros = {1, 2, 3, 4, 5}; 
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
  
        
    }
    public void big_number(){
    /*Implementa un programa que encuentre el número más grande en un array de números.*/
     int[] numeros = {10, 5, 27, 8, 45, 3}; 
        int maximo = numeros[0]; 

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El número más grande en el array es: " + maximo);
   
    }
    public void average(){
    /*Escribe un programa que calcule el promedio de los elementos en un array de números.*/
      int[] numeros = {10, 5, 27, 8, 45, 3}; 
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio de los elementos en el array es: " + promedio);
   
    }
    public void repeated_number(){
    /*Haz un programa que cuente cuántas veces aparece un número específico en un array.*/
       int[] numeros = {10, 5, 27, 8, 10, 45, 3, 10}; 
        int numeroBuscado = 10; 
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el array.");
    
    }
    public void invert(){
    /*Crea un programa que invierta un array, es decir, que los elementos estén en orden inverso.*/
      int[] numeros = {1, 2, 3, 4, 5}; 

        System.out.println("Array original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int longitud = numeros.length;
        int[] arrayInvertido = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arrayInvertido[i] = numeros[longitud - 1 - i];
        }

        System.out.println("\nArray invertido:");
        for (int numero : arrayInvertido) {
            System.out.print(numero + " ");
        }
    }
}
