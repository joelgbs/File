
import java.util.Scanner;

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
        exercises_with_if condiciones = new exercises_with_if ();
        exercises_with_loops bucles = new exercises_with_loops();
        exercises_with_array arry = new exercises_with_array();
        exercises_with_arrayList Alist = new exercises_with_arrayList();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("");
            System.out.println("Ejercicios de Programacion");
            System.out.println("Opcion 1: If");
            System.out.println("Opcion 2: Bucles (while and for)");
            System.out.println("Opcion 3: Array");
            System.out.println("Opcion 4: ArrayList");
            System.out.println("Opcion 5: Finalizar Programa");
            System.out.print("Escoge una opcion: ");
            opcion = scanner.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println("=================================== If ===================================");
                    System.out.println("");
                    System.out.println("Condiciones ");
                    System.out.println("Opcion 1: Número es positivo o negativo");
                    System.out.println("Opcion 2: Numero mayor o menor");
                    System.out.println("Opcion 3: Año bisiesto");
                    System.out.println("Opcion 4: Clasificacion de triangulos");
                    System.out.println("Opcion 5: Mayor de edad");
                    System.out.println("Opcion 6: Finalizar Programa");
                    System.out.print("Escoge una opcion: ");
                    int opc = scanner.nextInt();
                    
                    if (opc == 1){
                    condiciones.positive_or_negative();
                    }else if(opc == 2){
                    condiciones.bigger_number();
                    }else if(opc == 3){
                    condiciones.leap_year();
                    }else if(opc == 4){
                    condiciones.triangle_classification();
                    }else if(opc == 5){
                    condiciones.adult();
                    }
                    else if(opc == 6){
                    
                    }
                    
                    break;
                case 2:
                    System.out.println("=================================== Loops ===================================");
                    System.out.println("");
                    System.out.println("Bucles ");
                    System.out.println("Opcion 1: Numeros Pares");
                    System.out.println("Opcion 2: Factorial");
                    System.out.println("Opcion 3: Piramide");
                    System.out.println("Opcion 4: Numeros primos");
                    System.out.println("Opcion 5: Tabla de multiplicar");
                    System.out.println("Opcion 6: Finalizar Programa");
                    System.out.print("Escoge una opcion: ");
                    int opcb = scanner.nextInt();
                    
                    if (opcb == 1){
                    bucles.pair_numbers();
                    }else if(opcb == 2){
                    bucles.factorial();
                    }else if(opcb == 3){
                    bucles.check();
                    }else if(opcb == 4){
                    bucles.Prime_numbers();
                    }else if(opcb == 5){
                    bucles.multiplication_tables();
                    }
                    else if(opcb != 6){
                    
                    }
                    
                    break;
                case 3:
                    System.out.println("=================================== Array ===================================");
                    System.out.println("");
                    System.out.println("Array");
                    System.out.println("Opcion 1: Suma de elementos");
                    System.out.println("Opcion 2: Numero mas grande");
                    System.out.println("Opcion 3: Promedio");
                    System.out.println("Opcion 4: Repeticiones");
                    System.out.println("Opcion 5: Invertir");
                    System.out.println("Opcion 6: Finalizar Programa");
                    System.out.print("Escoge una opcion: ");
                    int opcc = scanner.nextInt();
                    
                    if (opcc == 1){
                        arry.sum_of_numbers();
                    }else if(opcc == 2){
                        arry.big_number();
                    }else if(opcc == 3){
                        arry.average();
                    }else if(opcc == 4){
                        arry.repeated_number();
                    }else if(opcc == 5){
                        arry.invert();
                    }
                    else if(opcc == 6){
                    
                    }
                    
                    break;
                case 4:
                    System.out.println("=================================== ArrayList ===================================");
                    System.out.println("");
                    System.out.println("ArrayList");
                    System.out.println("Opcion 1: Agregar");
                    System.out.println("Opcion 2: Eliminar");
                    System.out.println("Opcion 3: Encontrar");
                    System.out.println("Opcion 4: Ordenar");
                    System.out.println("Opcion 5: Interseccion");
                    System.out.println("Opcion 6: Finalizar Programa");
                    System.out.print("Escoge una opcion: ");
                    int opcd = scanner.nextInt();
                    
                    if (opcd == 1){
                        Alist.print_elements();
                    }else if(opcd == 2){
                        Alist.delete();
                    }else if(opcd == 3){
                        Alist.big_number();
                    }else if(opcd == 4){
                        Alist.order();
                    }else if(opcd == 5){
                        Alist.intersection();
                    }
                    else if(opcd == 6){
                    
                    }
                    
                    break;
                case 5:
                    System.out.println("*********************************** PROGRAMA FINALIZADO ***********************************");
                    
                    
                    break;
                default:System.out.println("LA OPCION QUE INGRESASTE NO ES VALIDA, SELECCIONA UNA OPCION ENTRE EL 1 Y 5");
            }
        }while(opcion == 5);  
    }
    
}
