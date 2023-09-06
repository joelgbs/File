
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ExerciseClass x = new ExerciseClass();
         
       
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("////////////////// Hola bienvenido \\\\\\\\\\\\\\\\\\\\\\");
        int opciones = 0;
        while(opciones <=7 ){
            System.out.print("******************************************************************************************");
        System.out.print("Escoge una opcion a continuacion"
                + "\nOpcion 1: Array con numeros primos"
                + "\nOpcion 2: Contar caracteres"
                + "\nOpcion 3: Array numero pares(100 al 200)"
                + "\nOpcion 4: Validar usuario y contraseña"
                + "\nOpcion 5: Array presentar nombres de mascotas"
                + "\nOpcion 6: Ejercicio extra"
                + "\nOpcion 7: Finalizar Programa"
                + "\nEscoge una opcion: ");
        opciones = scanner.nextInt();
       
       switch(opciones){
           
           case 1:
              /*Realizar un array con números primos que contenga los primeros veinte.*/
               System.out.println("----------------------------------------------------------------------------------------------");
               System.out.println("Exercise 1: Realizar un array con números primos que contenga los primeros veinte");
               x.numberPrimos();
               System.out.println("----------------------------------------------------------------------------------------------");
               break;
               
           case 2:
               /*Contar los caracteres de la siguiente cadena - unidad educativa uyumbicho, hoja de control diario*/
                System.out.println("\n----------------------------------------------------------------------------------------------");
                System.out.println("Exercise 2: Contar los caracteres de la siguiente cadena - unidad educativa uyumbicho, hoja de control diario ");
                x.caracteres();
                System.out.println("\n----------------------------------------------------------------------------------------------");
               break;
               
           case 3:
               /*Realizar un array que contenga números pares a partir del cien hasta el doscientos*/
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Exercise 3: Realizar un array que contenga números pares a partir del cien hasta el doscientos");
                x.pares();
                System.out.println("\n----------------------------------------------------------------------------------------------");
               break;
               
           case 4:
               /*Validar un usuario y contraseña que almacene tres usuarios*/
                System.out.println("----------------------------------------------------------------------------------------------");
               System.out.println("Exercise 4: Validar un usuario y contraseña que almacene tres usuarios");
                x.regis();
                System.out.println("\n----------------------------------------------------------------------------------------------");
               break;
               
           case 5:
               /*Realizar un array que contenga diez nombres de mascotas y presentar */
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Exercise 5: Realizar un array que contenga diez nombres de mascotas y presentar ");
                x.name();
                System.out.println("\n----------------------------------------------------------------------------------------------");
               break;
               
           case 6:
               /*Realizar un ejercicio con todo lo aprendido en clase*/
                System.out.println("----------------------------------------------------------------------------------------------");
               System.out.println("Exercise 6: Realizar un ejercicio con todo lo aprendido en clase");
               x.exerciseCOL();
                System.out.println("\n----------------------------------------------------------------------------------------------");
              
               break;
           default: System.out.println("Opcion Invalida");
       }
        
       
        
    }
    }
    
    

}
