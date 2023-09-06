
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class exercises_with_loops {
    Scanner scanner = new Scanner(System.in);
    public void pair_numbers (){
    /*Escribe un programa que solicite al usuario un número y luego utilice un bucle for para imprimir los números 
        del 1 al número ingresado, y un bucle while para contar cuántos de esos números son pares.*/
    
        System.out.print("Escribe un numero: ");
        int number = scanner.nextInt();
        int pares = 0;
        
        
        System.out.println("Números del 1 al " + number + ":");
        for(int i = 1;i<=number;i++){
            if(i %2==0){
            pares++;
            }
            while(i == number){
                System.out.println("Cantidad de numeros pares: "+pares);
                return;
        }
        }
   
        
    }
    public void factorial(){
    /*Implementa un programa que pida al usuario un número y utilice un bucle for para calcular su factorial, y un 
        bucle while para mostrar cada paso del cálculo.*/
    System.out.print("Ingresa un numero para calcular su factorial: ");
    int number = scanner.nextInt();
   long factorial = 1; 
   
   System.out.println("Cálculo del factorial de " + number + ":");
   
   for(int i =1;i<=number;i++){
       factorial *=i;
       
       int paso = i;
       System.out.print(paso);
       while (++paso <= number) {
                System.out.print(" * " + paso);
            }

            System.out.print(" = " + factorial);
            System.out.println();
        }

        System.out.println("El factorial de " + number + " es " + factorial);
   
   
   
   
    }
    public void check(){
    /*Crea un programa que muestre un patrón de asteriscos utilizando un bucle for para controlar las filas y un bucle 
        while para controlar las columnas.*/
         System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            int j = 1;
            while (j <= columnas) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
    public void Prime_numbers(){
    /*Escribe un programa que solicite al usuario un número y luego utilice un bucle for para encontrar todos los números
        primos hasta ese número, y un bucle while para mostrarlos.*/
      System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Números primos hasta " + numero + ":");

        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
    public void multiplication_tables(){
    /*Haz un programa que pida al usuario un número y utilice un bucle for para imprimir una tabla de multiplicación del 1 al 10 
        para ese número, y un bucle while para calcular la suma de los resultados de la tabla.*/
    
    System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicación del " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        int suma = 0;
        int i = 1;
        
        while (i <= numero) {
            suma += numero * i;
            i++;
        }

        System.out.println("La suma de los resultados es: " + suma);
 
    }
    
    
}
