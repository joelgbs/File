
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class array {

    public array() {
    }
    
    public void arrangements_1(){
        /*Suma de elementos: Crea un array de números enteros y calcula la suma de todos sus elementos.*/
         int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        JOptionPane.showMessageDialog(null, "La suma de los elementos es: " + suma);
   
    }
    public void arrangements_2(){
        /*Máximo y mínimo: Encuentra el valor máximo y mínimo en un array de números enteros.*/
         int[] numeros = {34, 12, 67, 45, 89};
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "Máximo: " + maximo + "\nMínimo: " + minimo);
    
    }
    public void arrangements_3(){
        /*Promedio: Calcula el promedio de un array de números enteros.*/
         int[] numeros = {25, 30, 40, 55, 12};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        double promedio = (double) suma / numeros.length;
        JOptionPane.showMessageDialog(null, "El promedio de los números es: " + promedio);
    
    }
    public void arrangements_4(){
        /*Búsqueda de elemento: Pide al usuario un número y verifica si está presente en un array predefinido.*/
           int[] numeros = {10, 25, 38, 47, 59};
        
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a buscar:"));
        
        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "El número está presente en el array.");
        } else {
            JOptionPane.showMessageDialog(null, "El número no está presente en el array.");
        }
    }
    public void arrangements_5(){
        /*Eliminación de duplicados: Elimina los elementos duplicados de un array.*/
         int[] numeros = {5, 10, 20, 10, 5, 30, 20};
        
        ArrayList<Integer> numerosUnicos = new ArrayList<>();

        for (int numero : numeros) {
            if (!numerosUnicos.contains(numero)) {
                numerosUnicos.add(numero);
            }
        }

        JOptionPane.showMessageDialog(null, "Array original: " + Arrays.toString(numeros) +
            "\nArray sin duplicados: " + numerosUnicos);
    
    }
    public void arrangements_6(){
        /*Ordenamiento: Ordena un array de números enteros en orden ascendente.*/
         int[] numeros = {17, 5, 23, 11, 8};
        
        Arrays.sort(numeros);

        JOptionPane.showMessageDialog(null, "Array ordenado: " + Arrays.toString(numeros));
    
    }
    public void arrangements_7(){
        /*Cuenta de ocurrencias: Cuenta cuántas veces aparece un número específico en un array.*/
         int[] numeros = {5, 10, 20, 10, 5, 30, 20};
        int numeroContar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a contar:"));
        
        int contador = 0;
        for (int numero : numeros) {
            if (numero == numeroContar) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "El número " + numeroContar + " aparece " + contador + " veces.");
   
    }
    public void arrangements_8(){
        /*Unión de arrays: Crea dos arrays y luego únelos en un tercer array.*/
           int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int[] arrayUnion = new int[array1.length + array2.length];
        
        System.arraycopy(array1, 0, arrayUnion, 0, array1.length);
        System.arraycopy(array2, 0, arrayUnion, array1.length, array2.length);

        JOptionPane.showMessageDialog(null, "Array 1: " + Arrays.toString(array1) +
            "\nArray 2: " + Arrays.toString(array2) +
            "\nArray de unión: " + Arrays.toString(arrayUnion));
  
    }
    
}
