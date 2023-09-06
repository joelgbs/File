
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class exercises_with_if {
    Scanner scanner = new Scanner (System.in);
    public void positive_or_negative(){
    /*Escribe un programa que determine si un número es positivo, negativo o cero.*/
        System.out.print("Escribe cualquier numero: ");
        int number = scanner.nextInt();
        
        if(number>=0){
            System.out.println("El valor es positivo");
            System.out.println("Valor: "+number);
        }else{
            System.out.println("El valor es negativo");
            System.out.println("Valor: "+number);
        }
    }
    public void bigger_number(){
    /*Crea un programa que pida al usuario dos números y muestre el mayor de los dos.*/
         System.out.print("Escribe el valor 1: ");
        int number1 = scanner.nextInt();
        //System.out.println("");
        System.out.print("Escribe el valor 2: ");
        int number2 = scanner.nextInt();
        
        if(number1 < number2){
            System.out.print("El numero mayor es el valor 2: "+number2);
        }else{
             System.out.print("El numero mayor es el valor 1: "+number1);
        }
    }
    public void leap_year(){
    /*Implementa un programa que calcule si un año es bisiesto o no.*/
    System.out.print("Escribe un año: ");
    int año = scanner.nextInt();
    
    if((año % 4 == 0 && año % 100 != 0 )|| año %400==0){
         System.out.println(año + " es un año bisiesto.");
    }else {
            System.out.println(año + " no es un año bisiesto.");
        }
        
    }
    public void triangle_classification(){
    /* Escribe un programa que clasifique un triángulo en equilátero, isósceles o escaleno según sus lados.*/
            System.out.print("Escribe el valor del lado 1: ");
            int lado1 = scanner.nextInt();
            System.out.print("Escribe el valor del lado 2: ");
            int lado2 = scanner.nextInt();
            System.out.print("Escribe el valor del lado 3: ");
            int lado3 = scanner.nextInt();
            
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                 System.out.println("Es un triangulo equilatero");
            }else if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Es un triangulo isoceles");
            }else{
                System.out.println("Es un triangulo escaleno");
            }
    }
    public void adult(){
    /*Crea un programa que determine si una persona es mayor de edad y si tiene carnet de conducir.*/
String permiso ;
        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("");
       if(edad >=18){
        System.out.print("Tienes carnet de conducir y(si) o n(no) ?");
        permiso = scanner.nextLine();
        System.out.println("Eres mayor de edad");
        System.out.println("Datos");
        System.out.println("Edad: "+edad);
        if(permiso == "s"){
        System.out.println("Licencia: si ");
        }else{
        System.out.println("Licencia: no ");
        }
       }else if(edad >=16){
           System.out.println("");
           System.out.print("Tienes carnet de conducir y(si) o n(no) ?");
        permiso = scanner.nextLine();
        System.out.println("Eres menor de edad");
        System.out.println("Datos");
        System.out.println("Edad: "+edad);
        if(permiso == "s"){
        System.out.println("Licencia: si ");
        }else{
        System.out.println("Licencia: no ");
        }   
       }else if(edad < 16 ){
        System.out.println("Eres menor de edad");
        System.out.println("Datos");
        System.out.println("Edad: "+edad);
       System.out.println("Licencia: no ");
       
       
       }
       }
        
        
    }
    

